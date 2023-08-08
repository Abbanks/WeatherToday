package com.olubankeeboda.weathertoday.core.database.model
//
//import androidx.room.ColumnInfo
//import androidx.room.Embedded
//import androidx.room.Entity
//import androidx.room.PrimaryKey
//import com.olubankeeboda.weathertoday.core.model.DailyWeatherForecast
//import com.olubankeeboda.weathertoday.core.model.WeatherForecastValues
//import java.time.OffsetDateTime
//
///**
// * Defines the summary of a day's weather condition of a city.
// *
// */
//@Entity(
//    tableName = "daily_weather_forecast"
//)
//data class DailyWeatherForecastEntity(
//    @PrimaryKey(autoGenerate = true) var id: Long? = null,
//    @ColumnInfo("day") val startTime: OffsetDateTime,
//    @Embedded val weatherForecastValuesEntity: List<WeatherForecastValuesEntity>
//)
//
//fun DailyWeatherForecastEntity.asExternalModel() = DailyWeatherForecast(
//    day = startTime,
//    weatherForecastValues = weatherForecastValuesEntity.map {
//        WeatherForecastValues(
//            dewPoint = it.dewPoint,
//            humidity = it.humidity,
//            iceAccumulation = it.iceAccumulation,
//            precipitationProbability = it.precipitationProbability,
//            precipitationIntensity = it.precipitationIntensity,
//            precipitationType = it.precipitationType,
//            pressureSurfaceLevel = it.pressureSurfaceLevel,
//            rainAccumulation = it.rainAccumulation,
//            snowAccumulation = it.snowAccumulation,
//            sunriseTime = it.sunriseTime,
//            sunsetTime = it.sunsetTime,
//            temperature = it.temperature,
//            temperatureApparent = it.temperatureApparent,
//            visibility = it.visibility,
//            weatherCode = it.weatherCode,
//            windDirection = it.windDirection,
//            windGust = it.windGust,
//            windSpeed = it.windSpeed
//        )
//    }
//)