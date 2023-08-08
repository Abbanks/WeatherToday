package com.olubankeeboda.weathertoday.core.database.dao
//
//import androidx.room.Dao
//import androidx.room.Delete
//import androidx.room.Insert
//import androidx.room.OnConflictStrategy
//import androidx.room.Query
//import com.olubankeeboda.weathertoday.core.database.model.DailyWeatherForecastEntity
//import kotlinx.coroutines.flow.Flow
//
///**
// * DAO for [DailyWeatherForecastEntity] access
// */
//@Dao
//interface DailyWeatherForecastDao {
//
//    @Query(value = "SELECT * FROM daily_weather_forecast")
//    fun getDailyWeatherForecastEntity(): Flow<DailyWeatherForecastEntity>
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertDailyWeatherForecastEntity(dailyWeatherForecastEntity: DailyWeatherForecastEntity): Long
//}