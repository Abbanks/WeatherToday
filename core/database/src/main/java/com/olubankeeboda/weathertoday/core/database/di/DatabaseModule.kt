package com.olubankeeboda.weathertoday.core.database.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//@Module
//@InstallIn(SingletonComponent::class)
//object DatabaseModule {
//    @Provides
//    @Singleton
//    fun provideAppDatabase(
//        @ApplicationContext
//        appContext: Context
//    ): WeatherTodayDatabase {
//        return Room.databaseBuilder(
//            appContext,
//            WeatherTodayDatabase::class.java,
//            "weather-today-database"
//        ).build()
//    }
//
//}
