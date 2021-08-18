package com.stepler.jokes.network

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path


interface RetrofitServices {

    @GET("/random/{count}")
    fun getJokes(@Path("count") count: Int): Single<Response>
}