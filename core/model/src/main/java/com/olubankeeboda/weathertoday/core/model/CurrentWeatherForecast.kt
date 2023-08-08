package com.olubankeeboda.weathertoday.core.model

 /*
  External data layer representation of a CurrentWeatherForecast
  */
data class CurrentWeatherForecast(
    val city: String,
    val weatherForecastValues: List<WeatherForecastValues>
 )