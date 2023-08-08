package com.olubankeeboda.weathertoday.core.model

import java.time.OffsetDateTime

/*
External data layer representation of a HourlyWeatherForecast
*/
data class HourlyWeatherForecast(
    val hour: OffsetDateTime,
    val weatherForecastValues: List<WeatherForecastValues>
)