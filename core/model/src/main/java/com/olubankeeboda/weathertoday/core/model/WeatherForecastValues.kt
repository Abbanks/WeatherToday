package com.olubankeeboda.weathertoday.core.model

import java.time.OffsetDateTime

data class WeatherForecastValues(
    val dewPoint: Double,
    val humidity: Double,
    val iceAccumulation: Number,
    val precipitationProbability: Int,
    val precipitationIntensity: Number,
    val precipitationType: Int,
    val pressureSurfaceLevel: Double,
    val rainAccumulation: Number,
    val snowAccumulation: Number,
    val sunriseTime: OffsetDateTime,
    val sunsetTime: OffsetDateTime,
    val temperature: Double,
    val temperatureApparent: Double,
    val visibility: Number,
    val weatherCode: Int,
    val windDirection: Double,
    val windGust: Double,
    val windSpeed: Double
)
