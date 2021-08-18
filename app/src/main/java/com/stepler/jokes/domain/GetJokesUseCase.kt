package com.stepler.jokes.domain

class GetJokesUseCase(private val jokesRepository: JokesRepository) {

    fun getJokes(count: Int) = jokesRepository.getJokes(count)
}