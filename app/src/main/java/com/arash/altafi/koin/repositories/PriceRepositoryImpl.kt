package com.arash.altafi.koin.repositories

import com.arash.altafi.koin.models.ResponsePrice
import com.arash.altafi.koin.sources.LocalPriceDataSource
import com.arash.altafi.koin.sources.PriceDataSource
import io.reactivex.Single

class PriceRepositoryImpl(val remotePrice: PriceDataSource, localPriceDataSource: LocalPriceDataSource) :
    PriceRepository {

    override fun getPrice(): Single<ResponsePrice> = remotePrice.getPrice()

}