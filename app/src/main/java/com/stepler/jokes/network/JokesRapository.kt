package com.stepler.jokes.network

interface JokesRapository {
    fun getJokes(count: Int): String
}