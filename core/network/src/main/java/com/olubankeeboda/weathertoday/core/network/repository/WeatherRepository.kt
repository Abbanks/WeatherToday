package com.olubankeeboda.weathertoday.core.network.repository

import com.olubankeeboda.weathertoday.core.network.model.WeatherNetworkResponse

interface WeatherRepository {
    suspend fun getWeather(
        apikey: String?,
        location: String?,
        units: String?,
        fields: String?,
        timesteps: String?,
        now: String?,
        timezone: String?
    ): Result<WeatherNetworkResponse>
}