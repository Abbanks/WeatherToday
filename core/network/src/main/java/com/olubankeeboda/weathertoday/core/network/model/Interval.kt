package com.olubankeeboda.weathertoday.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Interval(
    @SerialName("startTime")
    val startTime: String?,
    @SerialName("values")
    val values: Values?
)