package com.arash.altafi.koin.sources

import com.arash.altafi.koin.models.ResponsePrice
import io.reactivex.Single

class LocalPriceDataSource : PriceDataSource {

    override fun getPrice(): Single<ResponsePrice> {
        TODO("SAVE LOCAL PRICE")
    }

}