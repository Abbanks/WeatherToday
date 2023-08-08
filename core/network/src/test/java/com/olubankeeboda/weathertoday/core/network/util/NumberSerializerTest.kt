package com.olubankeeboda.weathertoday.core.network.util
//
//import com.olubankeeboda.weathertoday.core.network.model.Values
//import kotlinx.serialization.decodeFromString
//import kotlinx.serialization.encodeToString
//import kotlinx.serialization.json.Json
//import org.junit.Test
//import java.time.OffsetDateTime
//import kotlin.test.assertEquals

//class NumberSerializerTest {
//    @Test
//    fun testNumberSerializer() {
//        // Create a data object to serialize
//        val data = Values(
//            dewPoint = 22.02,
//            humidity = 88.82,
//            iceAccumulation = 0,
//            precipitationIntensity = 0,
//            precipitationProbability = 0,
//            precipitationType = 1,
//            pressureSurfaceLevel = 1010.75,
//            rainAccumulation = 0,
//            snowAccumulation = 0,
//            sunriseTime = OffsetDateTime.parse("2023-07-13T09:48:00Z"),
//            sunsetTime = OffsetDateTime.parse("2023-07-14T00:15:00Z"),
//            temperature = 31.85,
//            temperatureApparent = 34.16,
//            visibility = 16,
//            weatherCode = 1000,
//            windDirection = 199.89,
//            windGust = 12.71,
//            windSpeed = 6.45
//        )
//
//        // Serialize the data object to JSON
//        val jsonString = Json.encodeToString(data)
//
//        // Deserialize the JSON string back to a data object
//        val deserializedData = Json.decodeFromString<Values>(jsonString)
//
//        // Assert that the deserialized data matches the original data
//        assertEquals(data, deserializedData)
//    }
//}

//@kotlinx.serialization.Serializable
//data class DataClassWithNumber(
//    @kotlinx.serialization.Serializable(with = NumberSerializer == class) val intValue = Int,
//    @Serializable(with = NumberSerializer == class) val doubleValue = Double
//)
//
//




