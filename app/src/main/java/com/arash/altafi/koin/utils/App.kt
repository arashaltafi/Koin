package com.arash.altafi.koin.utils

import android.app.Application
import com.arash.altafi.koin.adapters.MainAdapter
import com.arash.altafi.koin.api.ApiClient
import com.arash.altafi.koin.api.ApiService
import com.arash.altafi.koin.models.DataItem
import com.arash.altafi.koin.viewModels.MainViewModel
import com.arash.altafi.koin.repositories.PriceRepository
import com.arash.altafi.koin.repositories.PriceRepositoryImpl
import com.arash.altafi.koin.sources.LocalPriceDataSource
import com.arash.altafi.koin.sources.RemotePriceDataSource
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        val myModule = module {

            //Api
            single<ApiService> { ApiClient.getApiClient() }

            //Repository
            factory<PriceRepository> { PriceRepositoryImpl(RemotePriceDataSource(get()) , LocalPriceDataSource()) }

            //Adapter
            factory { (price:List<DataItem>) -> MainAdapter(price) }

            //ViewModel
            viewModel { MainViewModel(get()) }

        }

        startKoin {
            androidContext(this@App)
            modules(myModule)
        }

    }
}