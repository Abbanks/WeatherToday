package com.olubankeeboda.weathertoday.core.common.network

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
annotation class Dispatcher(val wtDispatcher: WtDispatchers)

enum class WtDispatchers {
    Default,
    IO,
}
