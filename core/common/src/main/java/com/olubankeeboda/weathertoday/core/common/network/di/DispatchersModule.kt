package com.olubankeeboda.weathertoday.core.common.network.di

import com.olubankeeboda.weathertoday.core.common.network.Dispatcher
import com.olubankeeboda.weathertoday.core.common.network.WtDispatchers.Default
import com.olubankeeboda.weathertoday.core.common.network.WtDispatchers.IO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

@Module
@InstallIn(SingletonComponent::class)
object DispatchersModule {
    @Provides
    @Dispatcher(IO)
    fun providesIODispatcher(): CoroutineDispatcher = Dispatchers.IO

    @Provides
    @Dispatcher(Default)
    fun providesDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default
}
