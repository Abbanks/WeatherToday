package com.olubankeeboda.weathertoday.core.network

import com.olubankeeboda.weathertoday.core.network.model.WeatherNetworkResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET(
        value = "timelines"
    )
    suspend fun getWeatherForecast(
        @Query(value = "apikey", encoded = true) apikey: String?,
        @Query(value = "location", encoded = true) location: String?,
        @Query(value = "units") units: String?,
        @Query(value = "fields", encoded = true) fields: String?,
        @Query(value = "timesteps",encoded = true) timesteps: String?,
        @Query(value = "now", encoded = true) now: String?,
        @Query(value = "timezone", encoded = true) timezone: String?
    ): WeatherNetworkResponse

}
