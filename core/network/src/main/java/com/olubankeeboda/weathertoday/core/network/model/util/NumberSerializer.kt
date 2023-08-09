package com.olubankeeboda.weathertoday.core.network.model.util

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object NumberSerializer : KSerializer<Number> {
    override fun deserialize(decoder: Decoder): Number {
        return decoder.decodeDouble()
    }

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(
        serialName = "Number",
        kind = PrimitiveKind.DOUBLE
    )

    override fun serialize(encoder: Encoder, value: Number) =
        encoder.encodeDouble(value.toDouble())

}
