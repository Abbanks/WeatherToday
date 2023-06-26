package com.olubankeeboda.network

import com.olubankeeboda.network.model.NetworkCurrentWeather

/**
 * Interface representing network calls to the NIA backend
 */
interface WeatherNetworkDataSource {
    suspend fun getCurrentWeather(ids: List<String>? = null): List<NetworkCurrentWeather>

//    suspend fun getNewsResources(ids: List<String>? = null): List<NetworkNewsResource>
//
//    suspend fun getTopicChangeList(after: Int? = null): List<NetworkChangeList>
//
//    suspend fun getNewsResourceChangeList(after: Int? = null): List<NetworkChangeList>
}
