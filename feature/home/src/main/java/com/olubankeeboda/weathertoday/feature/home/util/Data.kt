package com.olubankeeboda.weathertoday.feature.home.util

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun weatherDescription(weatherCode: Int): String {
    var weatherDescription = ""
    when (weatherCode) {
        0 -> weatherDescription = "Unknown"
        1000 -> weatherDescription = "Clear"
        1001 -> weatherDescription = "Cloudy"
        1100 -> weatherDescription = "Mostly Clear"
        1101 -> weatherDescription = "Partly Cloudy"
        1102 -> weatherDescription = "Mostly Cloudy"
        2000 -> weatherDescription = "Fog"
        2100 -> weatherDescription = "Light Fog"
        3000 -> weatherDescription = "Breezy"
        3001 -> weatherDescription = "Windy"
        3002 -> weatherDescription = "Strong Wind"
        4000 -> weatherDescription = "Drizzle"
        4001 -> weatherDescription = "Rain"
        4200 -> weatherDescription = "Light Rain"
        4201 -> weatherDescription = "Heavy Rain"
        5000 -> weatherDescription = "Snow"
        5001 -> weatherDescription = "Flurries"
        5100 -> weatherDescription = "Light Snow"
        5101 -> weatherDescription = "Heavy Snow"
        6000 -> weatherDescription = "Freezing Drizzle"
        6001 -> weatherDescription = "Freezing Rain"
        6200 -> weatherDescription = "Light Freezing Rain"
        6201 -> weatherDescription = "Heavy Freezing Rain"
        7000 -> weatherDescription = "Ice Pellets"
        7101 -> weatherDescription = "Heavy Ice Pellets"
        7102 -> weatherDescription = "Light Ice Pellets"
        8000 -> weatherDescription = "Thunderstorm"
    }

    return weatherDescription
}

fun weatherDescriptionList(weatherCode: List<Int>): String {
    var weatherDescription = ""

    weatherCode.forEach { code ->
        when (code) {
            0 -> weatherDescription = "Unknown"
            1000 -> weatherDescription = "Clear"
            1001 -> weatherDescription = "Cloudy"
            1100 -> weatherDescription = "Mostly Clear"
            1101 -> weatherDescription = "Partly Cloudy"
            1102 -> weatherDescription = "Mostly Cloudy"
            2000 -> weatherDescription = "Fog"
            2100 -> weatherDescription = "Light Fog"
            3000 -> weatherDescription = "Breezy"
            3001 -> weatherDescription = "Windy"
            3002 -> weatherDescription = "Strong Wind"
            4000 -> weatherDescription = "Drizzle"
            4001 -> weatherDescription = "Rain"
            4200 -> weatherDescription = "Light Rain"
            4201 -> weatherDescription = "Heavy Rain"
            5000 -> weatherDescription = "Snow"
            5001 -> weatherDescription = "Flurries"
            5100 -> weatherDescription = "Light Snow"
            5101 -> weatherDescription = "Heavy Snow"
            6000 -> weatherDescription = "Freezing Drizzle"
            6001 -> weatherDescription = "Freezing Rain"
            6200 -> weatherDescription = "Light Freezing Rain"
            6201 -> weatherDescription = "Heavy Freezing Rain"
            7000 -> weatherDescription = "Ice Pellets"
            7101 -> weatherDescription = "Heavy Ice Pellets"
            7102 -> weatherDescription = "Light Ice Pellets"
            8000 -> weatherDescription = "Thunderstorm"
        }
    }
    return weatherDescription
}

fun extractTime(offsetDateTime: OffsetDateTime): String {
    val formatter = DateTimeFormatter.ofPattern("h:mma")

    //Convert offsetDateTime to LocalDateTime
    val dateTime = offsetDateTime.toLocalDateTime()

    return dateTime.format(formatter)
}

fun extractHour(offsetDateTime: OffsetDateTime): String {

    try {
        val formatter = DateTimeFormatter.ofPattern("ha")

        //Convert offsetDateTime to LocalDateTime
        val dateTime = offsetDateTime.toLocalDateTime()

        //Get current time of the day
        val currentDateTime = LocalDateTime.now()

        //format for printing
        val givenTimeString = dateTime.format(formatter)
        val currentTimeString = currentDateTime.format(formatter)

        val timeString = if (currentTimeString == givenTimeString) {
            "Now"
        } else {
            givenTimeString
        }

        return timeString

    } catch (e: DateTimeParseException) {
        // Handle parsing error
        return "Invalid DateTime"
    }
}

fun extractDay(offsetDateTime: OffsetDateTime): String {

    try {
        val formatter = DateTimeFormatter.ofPattern("E")

        //Convert offsetDateTime to LocalDateTime
        val dateTime = offsetDateTime.toLocalDateTime()

        //Get current time of the day
        val currentDateTime = LocalDateTime.now()

        //format for printing
        val givenDayString = dateTime.format(formatter)
        val currentDayString = currentDateTime.format(formatter)

        val dateString = if (currentDayString == givenDayString) {
            "Today"
        } else {
            givenDayString
        }

        return dateString

    } catch (e: DateTimeParseException) {
        // Handle parsing error
        return "Invalid DateTime"
    }
}