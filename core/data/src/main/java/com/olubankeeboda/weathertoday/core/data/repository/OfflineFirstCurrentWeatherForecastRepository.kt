package com.olubankeeboda.weathertoday.core.data.repository
//
//import com.olubankeeboda.weathertoday.core.data.model.asCurrentWeatherForecastEntity
//import com.olubankeeboda.weathertoday.core.database.dao.CurrentWeatherForecastDao
//import com.olubankeeboda.weathertoday.core.database.model.asExternalModel
//import com.olubankeeboda.weathertoday.core.model.CurrentWeatherForecast
//import com.olubankeeboda.weathertoday.core.network.repository.WeatherNetworkDataSourceImpl
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.map
//import kotlinx.coroutines.withContext
//import javax.inject.Inject
//
//class OfflineFirstCurrentWeatherForecastRepository @Inject constructor(
//    private val currentWeatherForecastDao: CurrentWeatherForecastDao,
//    private val networkDataSource: WeatherNetworkDataSourceImpl
//) : CurrentWeatherForecastRepository {
//
//    override fun getCurrentWeatherForecast(): Flow<CurrentWeatherForecast> =
//        currentWeatherForecastDao.getCurrentWeatherForecastEntity().map {
//            it.asExternalModel()
//        }
//
//    override suspend fun insertCurrentWeatherForecast() {
//        withContext(Dispatchers.IO) {
//            val weatherApiNetworkResponse = networkDataSource.getWeatherForecast()
//            currentWeatherForecastDao.insertCurrentWeatherForecastEntity(
//                weatherApiNetworkResponse.asCurrentWeatherForecastEntity()
//            )
//        }
//    }
//
//
//}