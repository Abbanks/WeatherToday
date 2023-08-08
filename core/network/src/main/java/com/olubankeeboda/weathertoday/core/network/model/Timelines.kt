package com.olubankeeboda.weathertoday.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Timelines(
    val timestep: String,
    val intervals: List<Interval>
)