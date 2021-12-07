package com.arash.altafi.koin.sources

import com.arash.altafi.koin.models.ResponsePrice
import io.reactivex.Single

interface PriceDataSource {

    fun getPrice() : Single<ResponsePrice>

}