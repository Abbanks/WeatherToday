package com.olubankeeboda.weathertoday.core.network.repository

import com.olubankeeboda.weathertoday.core.network.model.WeatherApiNetworkResponse

interface WeatherNetworkDataSource {
    suspend fun getWeatherForecast(
        location: String? = null,
        units: String? = null,
        timezone: String? = null
    ): WeatherApiNetworkResponse
}
