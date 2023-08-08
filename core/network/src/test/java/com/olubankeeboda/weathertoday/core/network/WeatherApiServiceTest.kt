package com.olubankeeboda.weathertoday.core.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.olubankeeboda.weathertoday.core.network.ApiConstants.WEATHER_ENDPOINT
import com.olubankeeboda.weathertoday.core.network.model.Interval
import com.olubankeeboda.weathertoday.core.network.model.Timelines
import com.olubankeeboda.weathertoday.core.network.model.Values
import enqueueResponse
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Rule
import org.junit.Test
import retrofit2.Retrofit
import java.time.OffsetDateTime
import java.util.concurrent.TimeUnit
import kotlin.test.assertEquals

@OptIn(ExperimentalCoroutinesApi::class)
class WeatherApiServiceTest() {

    private val testDispatcher = StandardTestDispatcher()

    @get:Rule
    val mockWebServer = MockWebServer()

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }

    private val client =
        OkHttpClient.Builder().connectTimeout(1, TimeUnit.SECONDS).readTimeout(1, TimeUnit.SECONDS)
            .writeTimeout(1, TimeUnit.SECONDS).build()

    private val networkJson = Json {
        ignoreUnknownKeys = true
    }

    private val api by lazy {
        Retrofit.Builder().baseUrl(mockWebServer.url("/")).callFactory(client).addConverterFactory(
            networkJson.asConverterFactory("application/json".toMediaType()),
        ).build().create(WeatherApiService::class.java)
    }

    @Test
    fun testGetWeatherEndpointCorrectly() = runTest(testDispatcher) {

        // Set up test data
        val location = arrayOf(40.758, -73.985).joinToString(",")
        val units = "metric"
        val fields = arrayOf(
            "temperature,precipitationIntensity,precipitationType,windSpeed,windGust," + "windDirection,temperatureApparent,cloudCover,cloudBase,cloudCeiling," + "weatherCode"
        ).joinToString(",")
        val timesteps = arrayOf("current,1h,1d").joinToString(",")
        val now = "moment.utc()"
        val timezone = "America/New_York"

        // Mock the server response
        mockWebServer.enqueueResponse("weather_forecast.json", 200)

        // Make the API request
        val apiResponse = api.getWeatherForecast(
            location = location,
            units = units,
            timezone = timezone
        )

        val expected = Timelines(
            timestep = "1d",
            intervals = listOf(
                Interval(
                    startTime = OffsetDateTime.parse("2023-07-13T10:00:00Z"),
                    values = Values(
                        dewPoint = 22.02,
                        humidity = 88.82,
                        iceAccumulation = 0,
                        precipitationIntensity = 0,
                        precipitationProbability = 0,
                        precipitationType = 1,
                        pressureSurfaceLevel = 1010.75,
                        rainAccumulation = 0,
                        snowAccumulation = 0,
                        sunriseTime = OffsetDateTime.parse("2023-07-13T09:48:00Z"),
                        sunsetTime = OffsetDateTime.parse("2023-07-14T00:15:00Z"),
                        temperature = 31.85,
                        temperatureApparent = 34.16,
                        visibility = 16,
                        weatherCode = 1000,
                        windDirection = 199.89,
                        windGust = 12.71,
                        windSpeed = 6.45
                    )
                )
            )
        )

        assertEquals(
            expected = expected.intervals.first(),
            actual = apiResponse.data.timelines.first().intervals.first(),
            message = null
        )

        // Assert the request made by the client
        val request = mockWebServer.takeRequest()

        assertEquals("GET", request.method)

        //Test Endpoint
        assertEquals(
            expected = "$WEATHER_ENDPOINT&location=40.758,-73.985&units=metric&timezone=America/New_York",
            actual = request.path
        )

    }
}
