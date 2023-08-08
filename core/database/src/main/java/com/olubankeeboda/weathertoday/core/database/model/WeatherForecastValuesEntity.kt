package com.olubankeeboda.weathertoday.core.database.model
//
//import androidx.room.ColumnInfo
//import androidx.room.Entity
//import androidx.room.TypeConverters
//import com.olubankeeboda.weathertoday.core.database.util.OffsetDateTimeTypeConverter
//import java.time.OffsetDateTime
//
//@TypeConverters(OffsetDateTimeTypeConverter::class)
//@Entity(
//    tableName = "weather_forecast_values"
//)
//data class WeatherForecastValuesEntity(
//    @ColumnInfo("dew_point") val dewPoint: Double,
//    val humidity: Double,
//    @ColumnInfo("ice_accumulation") val iceAccumulation: Number,
//    @ColumnInfo("precipitation_probability") val precipitationProbability: Int,
//    @ColumnInfo("precipitation_intensity") val precipitationIntensity: Number,
//    @ColumnInfo("precipitation_type") val precipitationType: Int,
//    @ColumnInfo("pressure_surface_level") val pressureSurfaceLevel: Double,
//    @ColumnInfo("rain_accumulation") val rainAccumulation: Number,
//    @ColumnInfo("snow_accumulation") val snowAccumulation: Number,
//    @ColumnInfo("sunrise_time") val sunriseTime: OffsetDateTime,
//    @ColumnInfo("sunset_time") val sunsetTime: OffsetDateTime,
//    val temperature: Double,
//    @ColumnInfo("temperature_apparent") val temperatureApparent: Double,
//    val visibility: Number,
//    @ColumnInfo("weather_code") val weatherCode: Int,
//    @ColumnInfo("wind_direction") val windDirection: Double,
//    @ColumnInfo("wind_gust") val windGust: Double,
//    @ColumnInfo("wind_speed") val windSpeed: Double
//)