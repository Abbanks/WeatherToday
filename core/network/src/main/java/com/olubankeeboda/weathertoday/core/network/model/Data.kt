package com.olubankeeboda.weathertoday.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val timelines: List<Timelines>
)