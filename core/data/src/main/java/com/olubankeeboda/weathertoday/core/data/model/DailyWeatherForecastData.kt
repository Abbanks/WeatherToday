package com.olubankeeboda.weathertoday.core.data.model
//
//import com.olubankeeboda.weathertoday.core.database.model.DailyWeatherForecastEntity
//import com.olubankeeboda.weathertoday.core.database.model.WeatherForecastValuesEntity
//import com.olubankeeboda.weathertoday.core.network.model.WeatherApiNetworkResponse
//
//fun WeatherApiNetworkResponse.asDailyWeatherForecastEntity(): DailyWeatherForecastEntity {
//    for (timelines in data.timelines) {
//        when (timelines.timeStep) {
//            "1d" -> {
//                for (interval in timelines.intervals) {
//                    return DailyWeatherForecastEntity(
//                        startTime = interval.startTime,
//                        weatherForecastValuesEntity = listOf(
//                            WeatherForecastValuesEntity(
//                                dewPoint = interval.values.dewPoint,
//                                humidity = interval.values.humidity,
//                                iceAccumulation = interval.values.iceAccumulation,
//                                precipitationProbability = interval.values.precipitationProbability,
//                                precipitationIntensity = interval.values.precipitationIntensity,
//                                precipitationType = interval.values.precipitationType,
//                                pressureSurfaceLevel = interval.values.pressureSurfaceLevel,
//                                rainAccumulation = interval.values.rainAccumulation,
//                                snowAccumulation = interval.values.snowAccumulation,
//                                sunriseTime = interval.values.sunriseTime,
//                                sunsetTime = interval.values.sunsetTime,
//                                temperature = interval.values.temperature,
//                                temperatureApparent = interval.values.temperatureApparent,
//                                visibility = interval.values.visibility,
//                                weatherCode = interval.values.weatherCode,
//                                windDirection = interval.values.windDirection,
//                                windGust = interval.values.windGust,
//                                windSpeed = interval.values.windSpeed
//                            )
//                        )
//                    )
//
//                }
//            }
//        }
//    }
//    // Handle the case where no "current" timeline is found (you can return a default entity or throw an exception)
//    throw NoSuchElementException("No '1d' timeline found in the response.")
//}