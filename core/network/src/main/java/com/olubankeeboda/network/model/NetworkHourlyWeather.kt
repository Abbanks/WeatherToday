package com.olubankeeboda.network.model

import kotlinx.serialization.Serializable

/**
 * Network representation of [NetworkHourlyWeather]
 */

@Serializable
data class NetworkHourlyWeather(
    val weatherDescription: String = ""
)