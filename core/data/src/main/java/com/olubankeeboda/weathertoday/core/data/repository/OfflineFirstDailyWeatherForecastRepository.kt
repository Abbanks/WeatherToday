package com.olubankeeboda.weathertoday.core.data.repository
//
//import com.olubankeeboda.weathertoday.core.data.model.asDailyWeatherForecastEntity
//import com.olubankeeboda.weathertoday.core.database.dao.DailyWeatherForecastDao
//import com.olubankeeboda.weathertoday.core.database.model.asExternalModel
//import com.olubankeeboda.weathertoday.core.model.DailyWeatherForecast
//import com.olubankeeboda.weathertoday.core.network.repository.WeatherNetworkDataSourceImpl
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.map
//import kotlinx.coroutines.withContext
//import javax.inject.Inject
//
//class OfflineFirstDailyWeatherForecastRepository @Inject constructor(
//    private val dailyWeatherForecastDao: DailyWeatherForecastDao,
//    private val networkDataSource: WeatherNetworkDataSourceImpl
//) : DailyWeatherForecastRepository {
//
//    override fun getDailyWeatherForecasts(): Flow<DailyWeatherForecast> =
//        dailyWeatherForecastDao.getDailyWeatherForecastEntity().map {
//            it.asExternalModel()
//        }
//
//    override suspend fun insertDailyWeatherForecast() {
//        withContext(Dispatchers.IO) {
//            val weatherApiNetworkResponse = networkDataSource.getWeatherForecast()
//            dailyWeatherForecastDao.insertDailyWeatherForecastEntity(
//                weatherApiNetworkResponse.asDailyWeatherForecastEntity()
//            )
//        }
//    }
//
//}