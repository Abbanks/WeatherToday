package com.olubankeeboda.weathertoday.core.model

import java.time.OffsetDateTime

/*
 External data layer representation of a DailyWeatherForecast
 */
data class DailyWeatherForecast(
    val day: OffsetDateTime,
    val weatherForecastValues: List<WeatherForecastValues>
)