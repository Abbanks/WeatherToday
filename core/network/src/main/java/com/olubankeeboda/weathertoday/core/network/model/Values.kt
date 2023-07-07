package com.olubankeeboda.weathertoday.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Values(
    @SerialName("cloudBase")
    val cloudBase: Double?,
    @SerialName("cloudCeiling")
    val cloudCeiling: Double?,
    @SerialName("cloudCover")
    val cloudCover: Double?,
    @SerialName("precipitationIntensity")
    val precipitationIntensity: Double?,
    @SerialName("precipitationType")
    val precipitationType: Int?,
    @SerialName("temperature")
    val temperature: Double?,
    @SerialName("temperatureApparent")
    val temperatureApparent: Double?,
    @SerialName("weatherCode")
    val weatherCode: Int?,
    @SerialName("windDirection")
    val windDirection: Double?,
    @SerialName("windGust")
    val windGust: Double?,
    @SerialName("windSpeed")
    val windSpeed: Double?
)
