package com.olubankeeboda.weathertoday.core.network.model

import com.olubankeeboda.weathertoday.core.network.model.util.NumberSerializer
import com.olubankeeboda.weathertoday.core.network.model.util.OffsetDateTimeSerializer
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.time.OffsetDateTime

@Serializable
data class Values(
    val dewPoint: Double,
    val humidity: Double,
    @Contextual
    @Serializable(with = NumberSerializer::class)
    val iceAccumulation: Number,
    val precipitationProbability: Int,
    @Serializable(with = NumberSerializer::class)
    val precipitationIntensity: Number,
    val precipitationType: Int,
    val pressureSurfaceLevel: Double,
    @Serializable(with = NumberSerializer::class)
    val rainAccumulation: Number,
    @Serializable(with = NumberSerializer::class)
    val snowAccumulation: Number,
    @Serializable(with = OffsetDateTimeSerializer::class) val sunriseTime: OffsetDateTime,
    @Serializable(with = OffsetDateTimeSerializer::class) val sunsetTime: OffsetDateTime,
    val temperature: Double,
    val temperatureApparent: Double,
    @Serializable(with = NumberSerializer::class)
    val visibility: Number,
    val weatherCode: Int,
    val windDirection: Double,
    val windGust: Double,
    val windSpeed: Double
)