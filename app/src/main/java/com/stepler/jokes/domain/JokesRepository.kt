package com.stepler.jokes.domain

import com.stepler.jokes.network.Response
import io.reactivex.rxjava3.core.Single

interface JokesRepository {

    fun getJokes(count: Int): Single<Response>
}