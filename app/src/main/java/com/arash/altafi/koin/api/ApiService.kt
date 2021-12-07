package com.arash.altafi.koin.api

import com.arash.altafi.koin.models.ResponsePrice
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("sana/json/index.html")
    fun getPrice() : Single<ResponsePrice>

}