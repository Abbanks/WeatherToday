package com.olubankeeboda.weathertoday.core.designsystem.icon

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Air
import androidx.compose.material.icons.filled.Percent
import androidx.compose.material.icons.filled.Radar
import androidx.compose.material.icons.filled.Thermostat
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.WaterDrop
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material.icons.filled.WbTwilight
import androidx.compose.material.icons.filled.WindPower
import androidx.compose.material.icons.outlined.CalendarMonth


/**
 * Weather Today icons. Material icons are [ImageVector]s, custom icons are drawable resource IDs.
 */
object WtIcons {
    val CalendarMonth = Icons.Outlined.CalendarMonth
    val UVIndex = Icons.Filled.WbSunny
    val Sunset = Icons.Filled.WbTwilight
    val Wind = Icons.Filled.Air
    val Rainfall = Icons.Filled.WaterDrop
    val FeelsLike = Icons.Filled.Thermostat
    val Humidity = Icons.Filled.Percent
    val Visibility = Icons.Filled.Visibility
    val Pressure = Icons.Filled.Radar
}