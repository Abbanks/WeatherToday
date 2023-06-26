package com.olubankeeboda.network

import kotlinx.serialization.Serializable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Wrapper for data provided from the [NiaBaseUrl]
 */
@Serializable
private data class NetworkResponse<T>(
    val data: T,
)

internal interface WeatherTodayApiService {
//    @GET(value = "topics")
//    suspend fun getTopics(
//        @Query("id") ids: List<String>?,
//    ): NetworkResponse<List<NetworkTopic>>
//
//    @GET(value = "newsresources")
//    suspend fun getNewsResources(
//        @Query("id") ids: List<String>?,
//    ): NetworkResponse<List<NetworkNewsResource>>
//
//    @GET(value = "changelists/topics")
//    suspend fun getTopicChangeList(
//        @Query("after") after: Int?,
//    ): List<NetworkChangeList>
//
//    @GET(value = "changelists/newsresources")
//    suspend fun getNewsResourcesChangeList(
//        @Query("after") after: Int?,
//    ): List<NetworkChangeList>
}

