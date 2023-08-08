package com.olubankeeboda.weathertoday.core.database.dao
//
//import androidx.room.Dao
//import androidx.room.Delete
//import androidx.room.Insert
//import androidx.room.OnConflictStrategy
//import androidx.room.Query
//import com.olubankeeboda.weathertoday.core.database.model.CurrentWeatherForecastEntity
//import kotlinx.coroutines.flow.Flow
//
///**
// * DAO for [CurrentWeatherForecastEntity] access
// */
//@Dao
//interface CurrentWeatherForecastDao {
//
//    @Query(value = "SELECT * FROM current_weather_forecast")
//    fun getCurrentWeatherForecastEntity(): Flow<CurrentWeatherForecastEntity>
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertCurrentWeatherForecastEntity(currentWeatherForecastEntity: CurrentWeatherForecastEntity):Long
//}