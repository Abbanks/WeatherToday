package com.olubankeeboda.weathertoday.core.data.repository
//
//import com.olubankeeboda.weathertoday.core.model.DailyWeatherForecast
//import kotlinx.coroutines.flow.Flow
//
//interface DailyWeatherForecastRepository {
//
//    /**
//     * Gets the available daily weather forecasts as a stream
//     */
//    fun getDailyWeatherForecasts(): Flow<DailyWeatherForecast>
//
//    /**
//     * Gets data for a specific daily weather forecast
//     */
////    fun getDailyWeatherForecast(id: String): Flow<DailyWeatherForecast>
//
//    /**
//     * Insert daily weather forecast
//     */
//    suspend fun insertDailyWeatherForecast()
//}