package com.olubankeeboda.weathertoday.core.network.model.util

import com.olubankeeboda.weathertoday.core.network.model.Values
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonPrimitive

@OptIn(ExperimentalSerializationApi::class)

object JsonPrimitiveSerializer : KSerializer<JsonPrimitive> {

    @OptIn(InternalSerializationApi::class, ExperimentalSerializationApi::class)
    override val descriptor: SerialDescriptor =
        buildSerialDescriptor("JsonPrimitiveSerializer", PolymorphicKind.SEALED)

    override fun serialize(encoder: Encoder, value: JsonPrimitive) {
        encoder.encodeString(value.content)
    }

    override fun deserialize(decoder: Decoder): JsonPrimitive {
        val input = decoder.decodeString()
        return JsonPrimitive(input)
    }
}



