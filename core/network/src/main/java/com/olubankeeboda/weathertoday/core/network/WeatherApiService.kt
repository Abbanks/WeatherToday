package com.olubankeeboda.weathertoday.core.network

import com.olubankeeboda.weathertoday.core.network.model.WeatherApiNetworkResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET(
        value = ApiConstants.WEATHER_ENDPOINT
    )
    suspend fun getWeatherForecast(
        @Query(value = ApiParameters.LOCATION, encoded = true) location: String?,
        @Query(value = ApiParameters.UNITS) units: String?,
        @Query(value = ApiParameters.TIME_ZONE, encoded = true) timezone: String?
    ): WeatherApiNetworkResponse
}
