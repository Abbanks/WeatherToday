package com.olubankeeboda.weathertoday.core.network.repository

import com.olubankeeboda.weathertoday.core.network.WeatherApiService
import com.olubankeeboda.weathertoday.core.network.model.WeatherApiNetworkResponse

/**
 * [WeatherNetworkDataSourceImpl] represents network calls to the WeatherAPI
 */
class WeatherNetworkDataSourceImpl(
    private val weatherApiService: WeatherApiService
) : WeatherNetworkDataSource {

    override suspend fun getWeatherForecast(
        location: String?,
        units: String?,
        timezone: String?,
    ): WeatherApiNetworkResponse =
        weatherApiService.getWeatherForecast(
            location = location,
            units = units,
            timezone = timezone,
        )

}

