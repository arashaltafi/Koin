package com.arash.altafi.koin.repositories

import com.arash.altafi.koin.models.ResponsePrice
import io.reactivex.Single

interface PriceRepository {

    fun getPrice() : Single<ResponsePrice>

}