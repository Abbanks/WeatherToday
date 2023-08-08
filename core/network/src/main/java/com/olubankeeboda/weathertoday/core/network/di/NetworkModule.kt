package com.olubankeeboda.weathertoday.core.network.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.olubankeeboda.weathertoday.core.network.ApiConstants
import com.olubankeeboda.weathertoday.core.network.BuildConfig
import com.olubankeeboda.weathertoday.core.network.WeatherApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun providesNetworkJson(): Json = Json {
        ignoreUnknownKeys = true
    }

    @Provides
    @Singleton
    fun okHttpCallFactory(): Call.Factory = OkHttpClient.Builder()
        .addInterceptor(
            HttpLoggingInterceptor()
                .apply {
                    if (BuildConfig.DEBUG) {
                        setLevel(HttpLoggingInterceptor.Level.BODY)
                    }
                },
        )
        .build()

    @Provides
    @Singleton
    fun providesRetrofit(): WeatherApiService =
        Retrofit.Builder()
            .baseUrl(ApiConstants.WEATHER_TODAY_BASE_URL)
            .callFactory(okHttpCallFactory())
            .addConverterFactory(
                providesNetworkJson().asConverterFactory("application/json".toMediaType()),
            )
            .build()
            .create(WeatherApiService::class.java)

}
