package com.stepler.jokes.app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stepler.jokes.domain.GetJokesUseCase
import com.stepler.jokes.network.Joke
import io.reactivex.rxjava3.functions.BiConsumer

class MainViewModel(private val getJokesUseCase: GetJokesUseCase) : ViewModel() {

    var listJoke = MutableLiveData<List<Joke>>()

    fun getListJokes(count: Int) {
        getJokesUseCase.getJokes(count).subscribe(
            {
                listJoke.value = it.jokes
            },
            {}
        )
    }
}