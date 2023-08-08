package com.olubankeeboda.weathertoday.core.network

object ApiConstants {
    //private const val WeatherTodayBaseUrl = BuildConfig.API_URL
   const val WEATHER_TODAY_BASE_URL = "https://api.tomorrow.io/v4"

    private const val API_KEY = "INSERT_YOUR_KEY_HERE"
    private const val FIELDS = "temperature,temperatureApparent,dewPoint,humidity,windSpeed,windGust," +
            "windDirection,pressureSurfaceLevel,precipitationIntensity,precipitationType," +
            "precipitationProbability,sunsetTime,sunriseTime,weatherCode,visibility," +
            "rainAccumulation,snowAccumulation,iceAccumulation"
    private const val TIMESTEPS = "current,1h,1d"
    private const val NOW = "moment.utc()"

    const val WEATHER_ENDPOINT = "/timelines?apikey=${API_KEY}&fields=${FIELDS}&${TIMESTEPS}&${NOW}"
}

object ApiParameters {
    const val LOCATION = "location"
    const val UNITS = "units"
    const val TIME_ZONE = "timezone"
}
