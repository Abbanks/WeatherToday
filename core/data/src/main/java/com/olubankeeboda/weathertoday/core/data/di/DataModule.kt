package com.olubankeeboda.weathertoday.core.data.di
//
//import com.olubankeeboda.weathertoday.core.data.repository.CurrentWeatherForecastRepository
//import com.olubankeeboda.weathertoday.core.data.repository.DailyWeatherForecastRepository
//import com.olubankeeboda.weathertoday.core.data.repository.HourlyWeatherForecastRepository
//import com.olubankeeboda.weathertoday.core.data.repository.OfflineFirstCurrentWeatherForecastRepository
//import com.olubankeeboda.weathertoday.core.data.repository.OfflineFirstDailyWeatherForecastRepository
//import com.olubankeeboda.weathertoday.core.data.repository.OfflineFirstHourlyWeatherForecastRepository
//import com.olubankeeboda.weathertoday.core.data.util.ConnectivityManagerNetworkMonitor
//import com.olubankeeboda.weathertoday.core.data.util.NetworkMonitor
//import dagger.Binds
//import dagger.Module
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//
//@Module
//@InstallIn(SingletonComponent::class)
//interface DataModule {
//    @Binds
//    fun bindsCurrentWeatherForecast(
//        currentWeatherForecastRepository: OfflineFirstCurrentWeatherForecastRepository
//    ): CurrentWeatherForecastRepository
//
//    @Binds
//    fun bindsHourlyWeatherForecast(
//        hourlyWeatherForecastRepository: OfflineFirstHourlyWeatherForecastRepository
//    ): HourlyWeatherForecastRepository
//
//    @Binds
//    fun bindsDailyWeatherForecast(
//        dailyWeatherForecastRepository: OfflineFirstDailyWeatherForecastRepository
//    ): DailyWeatherForecastRepository
//
//    @Binds
//    fun bindsNetworkMonitor(
//        networkMonitor: ConnectivityManagerNetworkMonitor,
//    ): NetworkMonitor
//}