package com.olubankeeboda.network.model

import kotlinx.serialization.Serializable

/**
 * Network representation of [NetworkCurrentWeather]
 */

@Serializable
data class NetworkCurrentWeather(
    val weatherDescription: String = ""
)