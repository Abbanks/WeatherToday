package com.olubankeeboda.weathertoday.core.network.model.util

import com.olubankeeboda.weathertoday.core.network.model.Values
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

object OffsetDateTimeSerializer : KSerializer<OffsetDateTime> {

    override fun deserialize(decoder: Decoder): OffsetDateTime {
        val formattedDateTime = decoder.decodeString()
        return OffsetDateTime.parse(formattedDateTime, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
    }

    override val descriptor: SerialDescriptor =  PrimitiveSerialDescriptor(
        serialName = "OffsetDateTime",
        kind = PrimitiveKind.STRING
    )

    override fun serialize(encoder: Encoder, value: OffsetDateTime) =
        encoder.encodeString(value.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME))
}
