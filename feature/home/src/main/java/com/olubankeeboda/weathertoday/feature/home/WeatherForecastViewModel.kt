package com.olubankeeboda.weathertoday.feature.home
//
//import androidx.lifecycle.SavedStateHandle
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.olubankeeboda.weathertoday.core.data.repository.OfflineFirstCurrentWeatherForecastRepository
//import com.olubankeeboda.weathertoday.core.data.repository.OfflineFirstDailyWeatherForecastRepository
//import com.olubankeeboda.weathertoday.core.data.repository.OfflineFirstHourlyWeatherForecastRepository
//import com.olubankeeboda.weathertoday.core.model.CurrentWeatherForecast
//import com.olubankeeboda.weathertoday.core.model.DailyWeatherForecast
//import com.olubankeeboda.weathertoday.core.model.HourlyWeatherForecast
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.flow.SharingStarted
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.flow.catch
//import kotlinx.coroutines.flow.map
//import kotlinx.coroutines.flow.stateIn
//import javax.inject.Inject
//
//@HiltViewModel
//class WeatherForecastViewModel @Inject constructor(
//    stateHandle: SavedStateHandle,
//    currentWeatherForecastRepository: OfflineFirstCurrentWeatherForecastRepository,
//    hourlyWeatherForecastRepository: OfflineFirstHourlyWeatherForecastRepository,
//    dailyWeatherForecastRepository: OfflineFirstDailyWeatherForecastRepository
//) : ViewModel() {
//
//    // Observe current weather forecast as the it changes over time
//    val currentWeatherForecastUiState: StateFlow<CurrentWeatherForecastUiState> =
//        currentWeatherForecastRepository
//            .getCurrentWeatherForecast()
//            .map<CurrentWeatherForecast, CurrentWeatherForecastUiState> {
//                CurrentWeatherForecastUiState.Success(currentWeatherForecast = it)
//            }
//            .catch { emit(CurrentWeatherForecastUiState.Error(it)) }
//            .stateIn(
//                viewModelScope,
//                SharingStarted.WhileSubscribed(5000),
//                CurrentWeatherForecastUiState.Loading
//            )
//
//    // Observe current weather forecast as the it changes over time
//    val hourlyWeatherForecastUiState: StateFlow<HourlyWeatherForecastUiState> =
//        hourlyWeatherForecastRepository
//            .getHourlyWeatherForecasts()
//            .map<HourlyWeatherForecast, HourlyWeatherForecastUiState> {
//                HourlyWeatherForecastUiState.Success(hourlyWeatherForecast = it)
//            }
//            .catch { emit(HourlyWeatherForecastUiState.Error(it)) }
//            .stateIn(
//                viewModelScope,
//                SharingStarted.WhileSubscribed(5000),
//                HourlyWeatherForecastUiState.Loading
//            )
//
//    // Observe current weather forecast as the it changes over time
//    val dailyWeatherForecastUiState: StateFlow<DailyWeatherForecastUiState> =
//        dailyWeatherForecastRepository
//            .getDailyWeatherForecasts()
//            .map<DailyWeatherForecast, DailyWeatherForecastUiState> {
//                DailyWeatherForecastUiState.Success(dailyWeatherForecast = it)
//            }
//            .catch { emit(DailyWeatherForecastUiState.Error(it)) }
//            .stateIn(
//                viewModelScope,
//                SharingStarted.WhileSubscribed(5000),
//                DailyWeatherForecastUiState.Loading
//            )
//
//
//}
//
//sealed interface CurrentWeatherForecastUiState {
//    data class Success(val currentWeatherForecast: CurrentWeatherForecast) :
//        CurrentWeatherForecastUiState
//
//    data class Error(val throwable: Throwable) : CurrentWeatherForecastUiState
//    object Loading : CurrentWeatherForecastUiState
//}
//
//sealed interface HourlyWeatherForecastUiState {
//    data class Success(val hourlyWeatherForecast: HourlyWeatherForecast) :
//        HourlyWeatherForecastUiState
//
//    data class Error(val throwable: Throwable) : HourlyWeatherForecastUiState
//    object Loading : HourlyWeatherForecastUiState
//}
//
//sealed interface DailyWeatherForecastUiState {
//
//    data class Success(val dailyWeatherForecast: DailyWeatherForecast) :
//        DailyWeatherForecastUiState
//
//    data class Error(val throwable: Throwable) : DailyWeatherForecastUiState
//    object Loading : DailyWeatherForecastUiState
//}
