package com.olubankeeboda.weathertoday.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.olubankeeboda.weathertoday.core.designsystem.component.NiaBackground
import com.olubankeeboda.weathertoday.core.designsystem.icon.WtIcons
import com.olubankeeboda.weathertoday.core.designsystem.theme.WeatherTodayTheme
import com.olubankeeboda.weathertoday.core.model.WeatherForecastValues
import com.olubankeeboda.weathertoday.feature.home.util.extractDay
import com.olubankeeboda.weathertoday.feature.home.util.extractHour
import com.olubankeeboda.weathertoday.feature.home.util.weatherDescription
import com.olubankeeboda.weathertoday.feature.home.util.weatherDescriptionList
//
//@Composable
//fun WeatherForecastRoute(
//    modifier: Modifier = Modifier,
//    viewModel: WeatherForecastViewModel = hiltViewModel()
//) {
//    val currentWeatherForecastUiState by viewModel.currentWeatherForecastUiState.collectAsStateWithLifecycle()
//    val hourlyWeatherForecastUiState by viewModel.hourlyWeatherForecastUiState.collectAsStateWithLifecycle()
//    val dailyWeatherForecastUiState by viewModel.dailyWeatherForecastUiState.collectAsStateWithLifecycle()
//
//    WeatherForecastScreen(
//        currentWeatherForecastUiState = currentWeatherForecastUiState,
//        hourlyWeatherForecastUiState = hourlyWeatherForecastUiState,
//        dailyWeatherForecastUiState = dailyWeatherForecastUiState
//    )
//
//}
//
//@Composable
//private fun SurfaceLayout(
//    content: @Composable () -> Unit,
//    modifier: Modifier = Modifier,
//) {
//    Surface(
//        shape = MaterialTheme.shapes.medium,
//        tonalElevation = 1.dp,
//        color = Color.LightGray,
//        modifier = modifier
//            .padding(1.dp),
//        content = content
//    )
//
//}
//
//@Composable
//private fun SurfaceTitle(
//    icon: ImageVector,
//    contentDescription: String,
//    title: String,
//    modifier: Modifier = Modifier
//) {
//    Row {
//        Icon(
//            imageVector = icon,
//            contentDescription = contentDescription,
//            modifier = modifier.size(15.dp)
//        )
//
//        Text(
//            text = title,
//            modifier = modifier.padding(start = 8.dp),
//            style = MaterialTheme.typography.bodySmall
//        )
//    }
//
//}
//
//@Composable
//private fun CurrentWeatherForecast(
//    city: String,
//    temperature: String,
//    description: String,
//    modifier: Modifier = Modifier
//) {
//    Column(
////        modifier.animateContentSize(
////            animationSpec = spring(
////                dampingRatio = Spring.DampingRatioNoBouncy,
////                stiffness = Spring.StiffnessLow
////            )
////        )
//    )
//    {
//        Text(
//            text = city,
//            style = MaterialTheme.typography.headlineMedium
//        )
//
//        Text(
//            text = temperature,
//            style = MaterialTheme.typography.displayLarge,
//            fontWeight = FontWeight.Light
//        )
//        Text(
//            description,
//            style = MaterialTheme.typography.titleSmall
//        )
//
//    }
//}
//
//@Composable
//private fun HourlyWeatherForecast(
//    summary: String,
//    hour: String,
//    weatherForecastValues: List<WeatherForecastValues>,
//    modifier: Modifier = Modifier
//) {
//
//    Column {
//        Text(
//            summary,
//            style = MaterialTheme.typography.bodySmall,
//            modifier = modifier.padding(start = 8.dp, top = 8.dp)
//        )
//
//        Divider(
//            modifier = modifier.padding(start = 10.dp, top = 8.dp),
//            color = Color.White,
//            thickness = 1.dp
//        )
//
//        LazyRow(
//            horizontalArrangement = Arrangement.spacedBy(8.dp),
//            contentPadding = PaddingValues(horizontal = 16.dp),
//            modifier = modifier
//        ) {
//            items(weatherForecastValues) { weatherForecast ->
//                HourlyWeatherForecastElement(
//                    hour = hour,
//                    weatherIcon = 0,
//                    temperature = weatherForecast.temperature.toString(),
//                )
//            }
//        }
//    }
//}
//
//@Composable
//private fun HourlyWeatherForecastElement(
//    hour: String,
//    weatherIcon: Int,
//    temperature: String,
//    modifier: Modifier = Modifier
//) {
//    Column(modifier = modifier.padding(start = 8.dp)) {
//        Text(
//            hour,
//            style = MaterialTheme.typography.bodySmall,
//            fontWeight = FontWeight.Medium,
//            modifier = modifier.padding(
//                top = 8.dp,
//                bottom = 10.dp,
//            )
//        )
//
//        Icon(
//            painter = painterResource(id = weatherIcon),
//            contentDescription = "weather icon",
//            modifier = modifier.size(20.dp)
//        )
//
//        Text(
//            temperature,
//            style = MaterialTheme.typography.bodyMedium,
//            fontWeight = FontWeight.Bold,
//            modifier = modifier.padding(
//                top = 10.dp,
//                bottom = 8.dp,
//            )
//        )
//    }
//}
//
//@Composable
//private fun DailyWeatherForecast(
//    day: String,
//    weatherForecastValues: List<WeatherForecastValues>,
//    modifier: Modifier = Modifier
//) {
//
//    Column(
//        modifier = modifier.padding(
//            top = 8.dp,
//            bottom = 8.dp,
//            start = 10.dp,
//            end = 10.dp
//        )
//    ) {
//        SurfaceTitle(
//            icon = WtIcons.CalendarMonth,
//            contentDescription = stringResource(R.string.calendar_icon),
//            title = stringResource(R.string._10_day_forecast)
//        )
//
//        Divider(
//            modifier = modifier.padding(start = 10.dp),
//            color = Color.White,
//            thickness = 1.dp
//        )
//
//        LazyColumn(
//            verticalArrangement = Arrangement.spacedBy(8.dp),
//            contentPadding = PaddingValues(horizontal = 16.dp),
//            modifier = modifier
//        ) {
//            items(weatherForecastValues) { weatherForecast ->
//                DailyWeatherForecastElement(
//                    day = day,
//                    weatherIcon = 0,
//                    precipitationIntensity = weatherForecast.precipitationIntensity.toString(),
//                    temperature = weatherForecast.temperature.toString()
//                )
//            }
//        }
//    }
//}
//
//@Composable
//private fun DailyWeatherForecastElement(
//    day: String,
//    weatherIcon: Int,
//    precipitationIntensity: String,
//    temperature: String,
//    modifier: Modifier = Modifier
//) {
//    Row() {
//        Text(
//            text = day,
//            style = MaterialTheme.typography.bodySmall
//        )
//
//        Column(modifier = modifier.padding(start = 40.dp)) {
//            Icon(
//                painter = painterResource(id = weatherIcon),
//                contentDescription = "weather icon"
//            )
//
//            Text(
//                text = precipitationIntensity,
//                style = MaterialTheme.typography.bodySmall,
//                fontWeight = FontWeight.Medium
//            )
//        }
//
//        Text(
//            text = temperature,
//            style = MaterialTheme.typography.bodyMedium,
//            fontWeight = FontWeight.Medium,
//            modifier = modifier.padding(start = 40.dp)
//        )
//    }
//}
//
//@Composable
//internal fun WeatherForecastScreen(
//    currentWeatherForecastUiState: CurrentWeatherForecastUiState,
//    hourlyWeatherForecastUiState: HourlyWeatherForecastUiState,
//    dailyWeatherForecastUiState: DailyWeatherForecastUiState,
//    modifier: Modifier = Modifier
//) {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = modifier
//            .padding(
//                start = 32.dp,
//                top = 32.dp,
//                end = 32.dp,
//                bottom = 20.dp
//            )
//            .verticalScroll(
//                state = rememberScrollState(),
//                reverseScrolling = true,
//
//                )
//    ) {
//        when (currentWeatherForecastUiState) {
//            is CurrentWeatherForecastUiState.Loading -> {
//
//            }
//
//            is CurrentWeatherForecastUiState.Success -> {
//                CurrentWeatherForecast(
//                    city = currentWeatherForecastUiState.currentWeatherForecast.city,
//                    temperature = currentWeatherForecastUiState.currentWeatherForecast.weatherForecastValues.first().temperature.toString(),
//                    description = weatherDescription(currentWeatherForecastUiState.currentWeatherForecast.weatherForecastValues.first().weatherCode)
//                )
//            }
//
//            is CurrentWeatherForecastUiState.Error -> {
//
//            }
//        }
//
//        Spacer(modifier = modifier.padding(top = 32.dp))
//
//        SurfaceLayout(
//            {
//                when (hourlyWeatherForecastUiState) {
//                    is HourlyWeatherForecastUiState.Loading -> {
//
//                    }
//
//                    is HourlyWeatherForecastUiState.Success -> {
//                        HourlyWeatherForecast(
//                            summary = weatherDescriptionList(hourlyWeatherForecastUiState.hourlyWeatherForecast.weatherForecastValues.map { it.weatherCode }),
//                            hour = extractHour(hourlyWeatherForecastUiState.hourlyWeatherForecast.hour),
//                            weatherForecastValues = hourlyWeatherForecastUiState.hourlyWeatherForecast.weatherForecastValues
//                        )
//                    }
//
//                    is HourlyWeatherForecastUiState.Error -> {
//
//                    }
//                }
//            }
//        )
//
//        Spacer(modifier = modifier.padding(top = 8.dp))
//
//        SurfaceLayout(
//            {
//                when (dailyWeatherForecastUiState) {
//                    is DailyWeatherForecastUiState.Loading -> {
//
//                    }
//
//                    is DailyWeatherForecastUiState.Success -> {
//                        DailyWeatherForecast(
//                            day = extractDay(dailyWeatherForecastUiState.dailyWeatherForecast.day),
//                            weatherForecastValues = dailyWeatherForecastUiState.dailyWeatherForecast.weatherForecastValues
//                        )
//                    }
//
//                    is DailyWeatherForecastUiState.Error -> {
//
//                    }
//                }
//            }
//        )
//    }
//}
//
//@Composable
//@Preview(device = "id:pixel_6", showSystemUi = true)
//fun HomeScreenPreview() {
//    WeatherTodayTheme {
//        NiaBackground {
//            WeatherForecastScreen(
//                currentWeatherForecastUiState = CurrentWeatherForecastUiState.Loading,
//                hourlyWeatherForecastUiState = HourlyWeatherForecastUiState.Loading,
//                dailyWeatherForecastUiState = DailyWeatherForecastUiState.Loading
//            )
//        }
//
//    }
//}







//@Composable
//private fun CurrentUVIndex(
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier.padding(
//            start = 10.dp,
//            end = 10.dp,
//            top = 4.dp,
//            bottom = 4.dp
//        )
//    ) {
//        SurfaceTitle(
//            icon = WtIcons.UVIndex,
//            contentDescription = stringResource(R.string.sun_icon),
//            title = stringResource(R.string.uv_index)
//        )
//    }
//
//}
//
//@Composable
//private fun CurrentSunset(
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier.padding(
//            start = 10.dp,
//            end = 10.dp,
//            top = 4.dp,
//            bottom = 4.dp
//        )
//    ) {
//
//        SurfaceTitle(
//            icon = WtIcons.Sunset,
//            contentDescription = stringResource(R.string.sun_icon),
//            title = stringResource(R.string.sunset)
//        )
//
//    }
//}
//
//
//@Composable
//private fun CurrentWind(
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier.padding(
//            start = 10.dp,
//            end = 10.dp,
//            top = 4.dp,
//            bottom = 4.dp
//        )
//    ) {
//        SurfaceTitle(
//            icon = WtIcons.Wind,
//            contentDescription = stringResource(R.string.air_icon),
//            title = stringResource(R.string.wind)
//        )
//    }
//
//}
//
//@Composable
//private fun CurrentRainfall(
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier.padding(
//            start = 10.dp,
//            end = 10.dp,
//            top = 4.dp,
//            bottom = 4.dp
//        )
//    ) {
//        SurfaceTitle(
//            icon = WtIcons.Rainfall,
//            contentDescription = stringResource(R.string.water_drop_icon),
//            title = stringResource(R.string.rainfall)
//        )
//    }
//
//}
//
//
//@Composable
//private fun CurrentFeelsLike(
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier.padding(
//            start = 10.dp,
//            end = 10.dp,
//            top = 4.dp,
//            bottom = 4.dp
//        )
//    ) {
//        SurfaceTitle(
//            icon = WtIcons.Rainfall,
//            contentDescription = stringResource(R.string.feels_like_icon),
//            title = stringResource(R.string.feels_like)
//        )
//    }
//
//}
//
//@Composable
//private fun CurrentHumidity(
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier.padding(
//            start = 10.dp,
//            end = 10.dp,
//            top = 4.dp,
//            bottom = 4.dp
//        )
//    ) {
//        SurfaceTitle(
//            icon = WtIcons.Humidity,
//            contentDescription = stringResource(R.string.percent_icon),
//            title = stringResource(R.string.humidity)
//        )
//    }
//
//}
//
//@Composable
//private fun CurrentVisibility(
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier.padding(
//            start = 10.dp,
//            end = 10.dp,
//            top = 4.dp,
//            bottom = 4.dp
//        )
//    ) {
//        SurfaceTitle(
//            icon = WtIcons.Visibility,
//            contentDescription = stringResource(R.string.visibility_icon),
//            title = stringResource(R.string.visibility)
//        )
//    }
//
//}
//
//@Composable
//private fun CurrentPressure(
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier.padding(
//            start = 10.dp,
//            end = 10.dp,
//            top = 4.dp,
//            bottom = 4.dp
//        )
//    ) {
//        SurfaceTitle(
//            icon = WtIcons.Pressure,
//            contentDescription = stringResource(R.string.pressure_icon),
//            title = stringResource(R.string.pressure)
//        )
//    }
//
//}

//
//        Spacer(modifier = modifier.padding(top = 8.dp))
//
//        Row() {
//            SurfaceLayout(
//                content = {
//                    CurrentUVIndex()
//                },
//                modifier = modifier.size(width = 160.dp, height = 150.dp)
//            )
//
//            Spacer(modifier = modifier.padding(start = 20.dp))
//
//            SurfaceLayout(
//                content = {
//                    CurrentSunset()
//                },
//                modifier = modifier.size(width = 160.dp, height = 150.dp)
//            )
//        }
//
//        Spacer(modifier = modifier.padding(top = 8.dp))
//
//        Row() {
//            SurfaceLayout(
//                content = {
//                    CurrentWind()
//                },
//                modifier = modifier.size(width = 160.dp, height = 150.dp)
//            )
//
//            Spacer(modifier = modifier.padding(start = 20.dp))
//
//            SurfaceLayout(
//                content = {
//                    CurrentRainfall()
//                },
//                modifier = modifier.size(width = 160.dp, height = 150.dp)
//            )
//
//        }
//
//        Spacer(modifier = modifier.padding(top = 8.dp))
//
//        Row() {
//            SurfaceLayout(
//                content = {
//                    CurrentFeelsLike()
//                },
//                modifier = modifier.size(width = 160.dp, height = 150.dp)
//            )
//
//            Spacer(modifier = modifier.padding(start = 20.dp))
//
//            SurfaceLayout(
//                content = {
//                    CurrentHumidity()
//                },
//                modifier = modifier.size(width = 160.dp, height = 150.dp)
//            )
//
//        }
//
//        Spacer(modifier = modifier.padding(top = 8.dp))
//
//        Row() {
//            SurfaceLayout(
//                content = {
//                    CurrentVisibility()
//                },
//                modifier = modifier.size(width = 160.dp, height = 150.dp)
//            )
//
//            Spacer(modifier = modifier.padding(start = 20.dp))
//
//            SurfaceLayout(
//                content = {
//                    CurrentPressure()
//                },
//                modifier = modifier.size(width = 160.dp, height = 150.dp)
//            )
//        }
//
//        Spacer(modifier = modifier.padding(top = 8.dp))

