package com.olubankeeboda.weathertoday.core.data.repository
//
//import com.olubankeeboda.weathertoday.core.model.HourlyWeatherForecast
//import com.olubankeeboda.weathertoday.core.network.model.WeatherApiNetworkResponse
//import kotlinx.coroutines.flow.Flow
//
//interface HourlyWeatherForecastRepository {
//
//    /**
//     * Gets the available hourly weather forecasts as a stream
//     */
//    fun getHourlyWeatherForecasts(): Flow<HourlyWeatherForecast>
//
//    /**
//     * Gets data for a specific hourly weather forecast
//     */
////    fun getHourlyWeatherForecast(id: String): Flow<HourlyWeatherForecast>
//
//    /**
//     * Insert hourly weather forecast
//     */
//    suspend fun insertHourlyWeatherForecast()
//}