package com.stepler.jokes.network

import com.stepler.jokes.domain.JokesRepository
import io.reactivex.rxjava3.core.Single

class JokesRepositoryImpl(val retrofitServices: RetrofitServices) : JokesRepository {

    override fun getJokes(count: Int): Single<Response> {
        return retrofitServices.getJokes(count)
    }

}