package com.olubankeeboda.weathertoday.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("timelines")
    val timelines: List<Timeline?>?
)