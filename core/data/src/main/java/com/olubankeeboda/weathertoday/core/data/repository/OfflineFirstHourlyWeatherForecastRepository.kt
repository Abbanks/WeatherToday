package com.olubankeeboda.weathertoday.core.data.repository
//
//import com.olubankeeboda.weathertoday.core.data.model.asHourlyWeatherForecastEntity
//import com.olubankeeboda.weathertoday.core.database.dao.HourlyWeatherForecastDao
//import com.olubankeeboda.weathertoday.core.database.model.asExternalModel
//import com.olubankeeboda.weathertoday.core.model.HourlyWeatherForecast
//import com.olubankeeboda.weathertoday.core.network.repository.WeatherNetworkDataSourceImpl
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.map
//import kotlinx.coroutines.withContext
//import javax.inject.Inject
//
//class OfflineFirstHourlyWeatherForecastRepository @Inject constructor(
//    private val hourlyWeatherForecastDao: HourlyWeatherForecastDao,
//    private val networkDataSource: WeatherNetworkDataSourceImpl
//) : HourlyWeatherForecastRepository {
//
//    override fun getHourlyWeatherForecasts(): Flow<HourlyWeatherForecast> =
//        hourlyWeatherForecastDao.getHourlyWeatherForecastEntity().map {
//            it.asExternalModel()
//        }
//
//    override suspend fun insertHourlyWeatherForecast() {
//        withContext(Dispatchers.IO) {
//            val weatherApiNetworkResponse = networkDataSource.getWeatherForecast()
//            hourlyWeatherForecastDao.insertHourlyWeatherForecast(
//                weatherApiNetworkResponse.asHourlyWeatherForecastEntity()
//            )
//        }
//    }
//
//
//}