package com.olubankeeboda.weathertoday.core.database.model
//
//import androidx.room.ColumnInfo
//import androidx.room.Embedded
//import androidx.room.Entity
//import androidx.room.PrimaryKey
//import com.olubankeeboda.weathertoday.core.model.CurrentWeatherForecast
//import com.olubankeeboda.weathertoday.core.model.WeatherForecastValues
//
///**
// * Defines a current weather condition of a city.
// *
// */
//@Entity(
//    tableName = "current_weather_forecast"
//)
//data class CurrentWeatherForecastEntity(
//    @PrimaryKey(autoGenerate = true) var id: Long? = null,
//    @ColumnInfo(defaultValue = "")
//    val city: String,
//    @Embedded val weatherForecastValuesEntity: List<WeatherForecastValuesEntity>
//)
//
//fun CurrentWeatherForecastEntity.asExternalModel() = CurrentWeatherForecast(
//    city = city,
//    weatherForecastValues = listOf(
//        WeatherForecastValues(
//            dewPoint = weatherForecastValuesEntity.first().dewPoint,
//            humidity = weatherForecastValuesEntity.first().humidity,
//            iceAccumulation = weatherForecastValuesEntity.first().iceAccumulation,
//            precipitationProbability = weatherForecastValuesEntity.first().precipitationProbability,
//            precipitationIntensity = weatherForecastValuesEntity.first().precipitationIntensity,
//            precipitationType = weatherForecastValuesEntity.first().precipitationType,
//            pressureSurfaceLevel = weatherForecastValuesEntity.first().pressureSurfaceLevel,
//            rainAccumulation = weatherForecastValuesEntity.first().rainAccumulation,
//            snowAccumulation = weatherForecastValuesEntity.first().snowAccumulation,
//            sunriseTime = weatherForecastValuesEntity.first().sunriseTime,
//            sunsetTime = weatherForecastValuesEntity.first().sunsetTime,
//            temperature = weatherForecastValuesEntity.first().temperature,
//            temperatureApparent = weatherForecastValuesEntity.first().temperatureApparent,
//            visibility = weatherForecastValuesEntity.first().visibility,
//            weatherCode = weatherForecastValuesEntity.first().weatherCode,
//            windDirection = weatherForecastValuesEntity.first().windDirection,
//            windGust = weatherForecastValuesEntity.first().windGust,
//            windSpeed = weatherForecastValuesEntity.first().windSpeed
//        )
//    )
//)
