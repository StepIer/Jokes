package com.stepler.jokes.network

data class Response(
    val type: String,
    val jokes: List<Joke>
)