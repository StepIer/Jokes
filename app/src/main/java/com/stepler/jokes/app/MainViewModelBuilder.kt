package com.stepler.jokes.app

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.stepler.jokes.domain.GetJokesUseCase

class MainViewModelBuilder(private val getJokesUseCase: GetJokesUseCase) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(getJokesUseCase) as T
    }
}