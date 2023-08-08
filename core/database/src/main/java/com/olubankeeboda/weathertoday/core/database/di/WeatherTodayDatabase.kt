package com.olubankeeboda.weathertoday.core.database.di

//import androidx.room.Database
//import androidx.room.RoomDatabase
//import androidx.room.TypeConverters
//import com.olubankeeboda.weathertoday.core.database.dao.CurrentWeatherForecastDao
//import com.olubankeeboda.weathertoday.core.database.dao.DailyWeatherForecastDao
//import com.olubankeeboda.weathertoday.core.database.dao.HourlyWeatherForecastDao
//import com.olubankeeboda.weathertoday.core.database.model.CurrentWeatherForecastEntity
//import com.olubankeeboda.weathertoday.core.database.model.DailyWeatherForecastEntity
//import com.olubankeeboda.weathertoday.core.database.model.HourlyWeatherForecastEntity
//import com.olubankeeboda.weathertoday.core.database.model.WeatherForecastValuesEntity
//import com.olubankeeboda.weathertoday.core.database.util.NumberTypeConverter
//import com.olubankeeboda.weathertoday.core.database.util.OffsetDateTimeTypeConverter

//@Database(
//    entities = [
//        CurrentWeatherForecastEntity::class,
//        HourlyWeatherForecastEntity::class,
//        DailyWeatherForecastEntity::class,
//        WeatherForecastValuesEntity::class
//    ],
//    version = 1,
//    exportSchema = true
//)
//@TypeConverters(
//    OffsetDateTimeTypeConverter::class,
//    NumberTypeConverter::class
//)
//abstract class WeatherTodayDatabase : RoomDatabase() {
//    abstract fun currentWeatherForecastDao(): CurrentWeatherForecastDao
//    abstract fun hourlyWeatherForecastDao(): HourlyWeatherForecastDao
//    abstract fun dailyWeatherForecastDao(): DailyWeatherForecastDao
//}