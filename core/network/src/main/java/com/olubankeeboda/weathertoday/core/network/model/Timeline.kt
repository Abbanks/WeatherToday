package com.olubankeeboda.weathertoday.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Timeline(
    @SerialName("intervals")
    val intervals: List<Interval?>?
)