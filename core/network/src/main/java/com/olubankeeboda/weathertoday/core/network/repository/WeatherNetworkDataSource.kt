package com.olubankeeboda.weathertoday.core.network.repository

import com.olubankeeboda.weathertoday.core.network.WeatherApiService
import com.olubankeeboda.weathertoday.core.network.model.WeatherNetworkResponse

/**
 * [WeatherNetworkDataSource] represents network calls to the WeatherAPI
 */
class WeatherNetworkDataSource(private val weatherApiService: WeatherApiService) :
    WeatherRepository {

    override suspend fun getWeather(
        apikey: String?,
        location: String?,
        units: String?,
        fields: String?,
        timesteps: String?,
        now: String?,
        timezone: String?
    ): Result<WeatherNetworkResponse> = kotlin.runCatching {
        weatherApiService.getWeatherForecast(
            apikey = apikey,
            location = location,
            units = units,
            fields = fields,
            timesteps = timesteps,
            now = now,
            timezone = timezone
        )
    }
}

