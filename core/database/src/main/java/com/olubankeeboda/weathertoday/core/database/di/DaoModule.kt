package com.olubankeeboda.weathertoday.core.database.di

//import com.olubankeeboda.weathertoday.core.database.dao.CurrentWeatherForecastDao
//import com.olubankeeboda.weathertoday.core.database.dao.DailyWeatherForecastDao
//import com.olubankeeboda.weathertoday.core.database.dao.HourlyWeatherForecastDao
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent

//@Module
//@InstallIn(SingletonComponent::class)
//object DaoModule {
//
//    @Provides
//    fun providesCurrentWeatherDao(database: WeatherTodayDatabase): CurrentWeatherForecastDao =
//        database.currentWeatherForecastDao()
//
//    @Provides
//    fun providesHourlyWeatherDao(database: WeatherTodayDatabase): HourlyWeatherForecastDao =
//        database.hourlyWeatherForecastDao()
//
//    @Provides
//    fun providesDailyWeatherDao(database: WeatherTodayDatabase): DailyWeatherForecastDao =
//        database.dailyWeatherForecastDao()
//
//}