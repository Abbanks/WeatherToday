package com.olubankeeboda.weathertoday.core.database.dao
//
//import androidx.room.Dao
//import androidx.room.Insert
//import androidx.room.OnConflictStrategy
//import androidx.room.Query
//import com.olubankeeboda.weathertoday.core.database.model.HourlyWeatherForecastEntity
//import kotlinx.coroutines.flow.Flow
//
///**
// * DAO for [HourlyWeatherForecastEntity] access
// */
//@Dao
//interface HourlyWeatherForecastDao {
//
//    @Query(value = "SELECT * FROM hourly_weather_forecast")
//    fun getHourlyWeatherForecastEntity(): Flow<HourlyWeatherForecastEntity>
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertHourlyWeatherForecast(hourlyWeatherForecastEntity: HourlyWeatherForecastEntity): Long
//}