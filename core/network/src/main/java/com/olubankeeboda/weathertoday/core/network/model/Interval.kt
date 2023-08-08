package com.olubankeeboda.weathertoday.core.network.model

import com.olubankeeboda.weathertoday.core.network.model.util.OffsetDateTimeSerializer
import kotlinx.serialization.Serializable
import java.time.OffsetDateTime

@Serializable
data class Interval(
    @Serializable(OffsetDateTimeSerializer::class) val startTime: OffsetDateTime,
    val values: Values
)
