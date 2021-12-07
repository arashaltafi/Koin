package com.arash.altafi.koin.sources

import com.arash.altafi.koin.api.ApiService
import com.arash.altafi.koin.models.ResponsePrice
import io.reactivex.Single

class RemotePriceDataSource(val apiService: ApiService) : PriceDataSource {

    override fun getPrice(): Single<ResponsePrice> = apiService.getPrice()

}