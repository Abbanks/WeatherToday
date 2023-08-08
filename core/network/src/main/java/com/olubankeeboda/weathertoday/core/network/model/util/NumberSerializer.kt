package com.olubankeeboda.weathertoday.core.network.model.util

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object NumberSerializer : KSerializer<Number> {

    override fun serialize(encoder: Encoder, value: Number) {
//        return if(value.toInt() == value){
//            encoder.encodeInt(value as Int)
//        } else {
//            encoder.encodeDouble(value as Double)
//        }
        encoder.encodeString(value.toString())
    }

    override fun deserialize(decoder: Decoder): Number {
        return decoder.decodeInt()
//        return if (string.contains(".")){
//            string.toDouble()
//        }else string.toInt()
//        return when {
//            string.contains(".") -> string.toDouble()
//            else -> string.toInt()
//        }
    }

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(
        serialName = "Number",
        kind = PrimitiveKind.STRING
    )

}
