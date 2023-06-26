package com.olubankeeboda.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.olubankeeboda.network.model.NetworkCurrentWeather
import com.olubankeeboda.weathertoday.core.network.BuildConfig
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

private const val WeatherTodayBaseUrl = BuildConfig.BACKEND_URL

@Singleton
class RetrofitNetwork @Inject constructor(
    networkJson: Json,
    okhttpCallFactory: Call.Factory,
) : WeatherNetworkDataSource {

    private val networkApi = Retrofit.Builder()
        .baseUrl(WeatherTodayBaseUrl)
        .callFactory(okhttpCallFactory)
        .addConverterFactory(
            networkJson.asConverterFactory("application/json".toMediaType()),
        )
        .build()
        .create(WeatherTodayApiService::class.java)

    override suspend fun getCurrentWeather(ids: List<String>?): List<NetworkCurrentWeather> =
        networkApi.getTopics(ids = ids).data
//
//
//
//    override suspend fun getNewsResources(ids: List<String>?): List<NetworkNewsResource> =
//        networkApi.getNewsResources(ids = ids).data
//
//    override suspend fun getTopicChangeList(after: Int?): List<NetworkChangeList> =
//        networkApi.getTopicChangeList(after = after)
//
//    override suspend fun getNewsResourceChangeList(after: Int?): List<NetworkChangeList> =
//        networkApi.getNewsResourcesChangeList(after = after)
}
