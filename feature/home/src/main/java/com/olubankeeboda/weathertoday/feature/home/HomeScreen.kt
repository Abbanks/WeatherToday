package com.olubankeeboda.weathertoday.feature.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.olubankeeboda.weathertoday.core.designsystem.component.NiaBackground
import com.olubankeeboda.weathertoday.core.designsystem.icon.WtIcons
import com.olubankeeboda.weathertoday.core.designsystem.theme.WeatherTodayTheme

@Composable
private fun SurfaceLayout(
    content: @Composable () -> Unit,
    modifier: Modifier = Modifier,
) {
    Surface(
        shape = MaterialTheme.shapes.medium,
        tonalElevation = 1.dp,
        color = Color.LightGray,
        modifier = modifier
            .padding(1.dp),
        content = content
    )

}

@Composable
private fun SurfaceTitle(
    icon: ImageVector,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Row {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = modifier.size(15.dp)
        )

        Text(
            text = title,
            modifier = modifier.padding(start = 8.dp),
            style = MaterialTheme.typography.bodySmall
        )
    }

}

@Composable
private fun CurrentWeatherForecast(
    city: String,
    temperature: String,
    description: String,
    highestTemp: String,
    lowestTemp: String,
    modifier: Modifier = Modifier
) {
    Column(
//        modifier.animateContentSize(
//            animationSpec = spring(
//                dampingRatio = Spring.DampingRatioNoBouncy,
//                stiffness = Spring.StiffnessLow
//            )
//        )
    )
    {
        Text(
            text = city,
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = temperature,
            style = MaterialTheme.typography.displayLarge,
            fontWeight = FontWeight.Light
        )
        Text(
            description,
            style = MaterialTheme.typography.titleSmall
        )

        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                highestTemp,
                style = MaterialTheme.typography.titleSmall
            )

            Spacer(modifier = Modifier.padding(8.dp))

            Text(
                lowestTemp,
                style = MaterialTheme.typography.titleSmall
            )
        }

    }
}

@Composable
private fun HourlyWeatherForecast(
    summary: String,
    hour: String,
    @DrawableRes icon: Int,
    temperature: String,
    modifier: Modifier = Modifier
) {

    Column {
        Text(
            summary,
            style = MaterialTheme.typography.bodySmall,
            modifier = modifier.padding(start = 8.dp, top = 8.dp)
        )

        Divider(
            modifier = modifier.padding(start = 10.dp, top = 8.dp),
            color = Color.White,
            thickness = 1.dp
        )

        Column(modifier = modifier.padding(start = 8.dp)) {
            Text(
                hour,
                style = MaterialTheme.typography.bodySmall,
                fontWeight = FontWeight.Medium,
                modifier = modifier.padding(
                    top = 8.dp,
                    bottom = 10.dp,
                )
            )

            Icon(
                painter = painterResource(id = icon),
                contentDescription = "weather icon",
                modifier = modifier.size(20.dp)
            )

            Text(
                temperature,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(
                    top = 10.dp,
                    bottom = 8.dp,
                )
            )
        }

    }

}

@Composable
private fun CurrentUVIndex(
    modifier: Modifier = Modifier
) {
    Column(
        modifier.padding(
            start = 10.dp,
            end = 10.dp,
            top = 4.dp,
            bottom = 4.dp
        )
    ) {
        SurfaceTitle(
            icon = WtIcons.UVIndex,
            contentDescription = stringResource(R.string.sun_icon),
            title = stringResource(R.string.uv_index)
        )
    }

}

@Composable
private fun CurrentSunset(
    modifier: Modifier = Modifier
) {
    Column(
        modifier.padding(
            start = 10.dp,
            end = 10.dp,
            top = 4.dp,
            bottom = 4.dp
        )
    ) {

        SurfaceTitle(
            icon = WtIcons.Sunset,
            contentDescription = stringResource(R.string.sun_icon),
            title = stringResource(R.string.sunset)
        )

    }
}


@Composable
private fun CurrentWind(
    modifier: Modifier = Modifier
) {
    Column(
        modifier.padding(
            start = 10.dp,
            end = 10.dp,
            top = 4.dp,
            bottom = 4.dp
        )
    ) {
        SurfaceTitle(
            icon = WtIcons.Wind,
            contentDescription = stringResource(R.string.air_icon),
            title = stringResource(R.string.wind)
        )
    }

}

@Composable
private fun CurrentRainfall(
    modifier: Modifier = Modifier
) {
    Column(
        modifier.padding(
            start = 10.dp,
            end = 10.dp,
            top = 4.dp,
            bottom = 4.dp
        )
    ) {
        SurfaceTitle(
            icon = WtIcons.Rainfall,
            contentDescription = stringResource(R.string.water_drop_icon),
            title = stringResource(R.string.rainfall)
        )
    }

}


@Composable
private fun CurrentFeelsLike(
    modifier: Modifier = Modifier
) {
    Column(
        modifier.padding(
            start = 10.dp,
            end = 10.dp,
            top = 4.dp,
            bottom = 4.dp
        )
    ) {
        SurfaceTitle(
            icon = WtIcons.Rainfall,
            contentDescription = stringResource(R.string.feels_like_icon),
            title = stringResource(R.string.feels_like)
        )
    }

}

@Composable
private fun CurrentHumidity(
    modifier: Modifier = Modifier
) {
    Column(
        modifier.padding(
            start = 10.dp,
            end = 10.dp,
            top = 4.dp,
            bottom = 4.dp
        )
    ) {
        SurfaceTitle(
            icon = WtIcons.Humidity,
            contentDescription = stringResource(R.string.percent_icon),
            title = stringResource(R.string.humidity)
        )
    }

}

@Composable
private fun CurrentVisibility(
    modifier: Modifier = Modifier
) {
    Column(
        modifier.padding(
            start = 10.dp,
            end = 10.dp,
            top = 4.dp,
            bottom = 4.dp
        )
    ) {
        SurfaceTitle(
            icon = WtIcons.Visibility,
            contentDescription = stringResource(R.string.visibility_icon),
            title = stringResource(R.string.visibility)
        )
    }

}

@Composable
private fun CurrentPressure(
    modifier: Modifier = Modifier
) {
    Column(
        modifier.padding(
            start = 10.dp,
            end = 10.dp,
            top = 4.dp,
            bottom = 4.dp
        )
    ) {
        SurfaceTitle(
            icon = WtIcons.Pressure,
            contentDescription = stringResource(R.string.pressure_icon),
            title = stringResource(R.string.pressure)
        )
    }

}

@Composable
private fun TenDayWeatherForecast(
    day: String,
    @DrawableRes icon: Int,
    percentage: String,
    highestTemp: String,
    lowestTemp: String,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier.padding(
            top = 8.dp,
            bottom = 8.dp,
            start = 10.dp,
            end = 10.dp
        )
    ) {
        SurfaceTitle(
            icon = WtIcons.CalendarMonth,
            contentDescription = stringResource(R.string.calendar_icon),
            title = stringResource(R.string._10_day_forecast)
        )

        Divider(
            modifier = modifier.padding(start = 10.dp),
            color = Color.White,
            thickness = 1.dp
        )

        Row() {
            Text(
                day,
                style = MaterialTheme.typography.bodySmall
            )

            Column(modifier = modifier.padding(start = 40.dp)) {
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = "weather icon"
                )

                Text(
                    percentage,
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Medium
                )
            }

            Text(
                lowestTemp,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                modifier = modifier.padding(start = 40.dp)
            )

            Text(
                highestTemp,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(start = 20.dp)
            )

        }
    }

}

@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(
                start = 32.dp,
                top = 32.dp,
                end = 32.dp,
                bottom = 20.dp
            )
            .verticalScroll(
                state = rememberScrollState(),
                reverseScrolling = true,

                )
    ) {
        CurrentWeatherForecast(
            "Calabar",
            "23",
            "Showers",
            "H: 28",
            "L: 22"
        )

        Spacer(modifier = modifier.padding(top = 32.dp))

        SurfaceLayout(
            {
                HourlyWeatherForecast(
                    summary = "Cloudy conditions expected around 6PM",
                    hour = "10am",
                    icon = R.drawable.sunny,
                    temperature = "23"
                )
            }
        )

        Spacer(modifier = modifier.padding(top = 8.dp))

        Row() {
            SurfaceLayout(
                content = {
                    CurrentUVIndex()
                },
                modifier = modifier.size(width = 160.dp, height = 150.dp)
            )

            Spacer(modifier = modifier.padding(start = 20.dp))

            SurfaceLayout(
                content = {
                    CurrentSunset()
                },
                modifier = modifier.size(width = 160.dp, height = 150.dp)
            )
        }

        Spacer(modifier = modifier.padding(top = 8.dp))

        Row() {
            SurfaceLayout(
                content = {
                    CurrentWind()
                },
                modifier = modifier.size(width = 160.dp, height = 150.dp)
            )

            Spacer(modifier = modifier.padding(start = 20.dp))

            SurfaceLayout(
                content = {
                    CurrentRainfall()
                },
                modifier = modifier.size(width = 160.dp, height = 150.dp)
            )

        }

        Spacer(modifier = modifier.padding(top = 8.dp))

        Row() {
            SurfaceLayout(
                content = {
                    CurrentFeelsLike()
                },
                modifier = modifier.size(width = 160.dp, height = 150.dp)
            )

            Spacer(modifier = modifier.padding(start = 20.dp))

            SurfaceLayout(
                content = {
                    CurrentHumidity()
                },
                modifier = modifier.size(width = 160.dp, height = 150.dp)
            )

        }

        Spacer(modifier = modifier.padding(top = 8.dp))

        Row() {
            SurfaceLayout(
                content = {
                    CurrentVisibility()
                },
                modifier = modifier.size(width = 160.dp, height = 150.dp)
            )

            Spacer(modifier = modifier.padding(start = 20.dp))

            SurfaceLayout(
                content = {
                    CurrentPressure()
                },
                modifier = modifier.size(width = 160.dp, height = 150.dp)
            )
        }

        Spacer(modifier = modifier.padding(top = 8.dp))

        SurfaceLayout(
            {
                TenDayWeatherForecast(
                    day = "Today",
                    icon = R.drawable.sunny,
                    percentage = "90%",
                    highestTemp = "28",
                    lowestTemp = "22"
                )
            }
        )

    }
}

@Composable
@Preview(device = "id:pixel_6", showSystemUi = true)
private fun HomeScreenPreview() {
    WeatherTodayTheme {
        NiaBackground {
            HomeScreen()
        }

    }


}