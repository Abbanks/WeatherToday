package com.olubankeeboda.weathertoday.core.network.repository

import com.olubankeeboda.weathertoday.core.network.WeatherApiService
import com.olubankeeboda.weathertoday.core.network.model.Data
import com.olubankeeboda.weathertoday.core.network.model.Interval
import com.olubankeeboda.weathertoday.core.network.model.Timelines
import com.olubankeeboda.weathertoday.core.network.model.Values
import com.olubankeeboda.weathertoday.core.network.model.WeatherApiNetworkResponse
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner
import java.time.OffsetDateTime
import kotlin.test.assertEquals

@RunWith(MockitoJUnitRunner::class)
@OptIn(ExperimentalCoroutinesApi::class)
class WeatherNetworkDataSourceTest {

    private val testDispatcher = StandardTestDispatcher()

    @Mock
    private val weatherApiService: WeatherApiService = mock(WeatherApiService::class.java)

    @Mock
    private lateinit var weatherNetworkDataSource: WeatherNetworkDataSourceImpl

    @Before
    fun setup() {
        weatherNetworkDataSource = WeatherNetworkDataSourceImpl(weatherApiService)
    }

    @Test
    fun testGetWeather() = runTest(testDispatcher) {
        // Mock the response data
        val expectedWeatherResponse = WeatherApiNetworkResponse(
            data = Data(
                timelines = listOf(
                    Timelines(
                        timestep = "1d",
                        intervals = listOf(
                            Interval(
                                startTime = OffsetDateTime.parse("2023-07-13T10:00:00Z"),
                                values = Values(
                                    dewPoint = 22.02,
                                    humidity = 88.82,
                                    iceAccumulation = 0.toDouble(),
                                    precipitationIntensity = 0.toDouble(),
                                    precipitationProbability = 0,
                                    precipitationType = 1,
                                    pressureSurfaceLevel = 1010.75,
                                    rainAccumulation = 0.toDouble(),
                                    snowAccumulation = 0.toDouble(),
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
                )
            )
        )

        val location = arrayOf(40.758, -73.985).joinToString(",")
        val units = "metric"
        val timezone = "America/New_York"

        `when`(
            weatherApiService.getWeatherForecast(
                location = location,
                units = units,
                timezone = timezone
            )
        ).thenReturn(expectedWeatherResponse)

        // Call the repository method
        val actualWeatherResponse = weatherNetworkDataSource.getWeatherForecast(
            location = location,
            units = units,
            timezone = timezone
        ).toString()

        // Verify the interaction with the API service
        verify(weatherApiService).getWeatherForecast(
            location = location,
            units = units,
            timezone = timezone
        )

        // Assert the expected and actual responses
        assertEquals(expected = expectedWeatherResponse.toString(), actual = actualWeatherResponse)
    }
}
