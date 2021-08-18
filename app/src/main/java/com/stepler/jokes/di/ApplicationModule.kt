package com.stepler.jokes.di

import com.stepler.jokes.app.MainViewModel
import com.stepler.jokes.domain.GetJokesUseCase
import com.stepler.jokes.domain.JokesRepository
import com.stepler.jokes.network.JokesRepositoryImpl
import com.stepler.jokes.network.RetrofitServices
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import retrofit2.Retrofit

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


@Module
internal class ApplicationModule {

    @Provides
    @Singleton
    fun provideMainViewModel(getJokesUseCase: GetJokesUseCase) = MainViewModel(getJokesUseCase)

    @Provides
    @Singleton
    fun provideBaseUrl() = "http://api.icndb.com/jokes"

    @Provides
    @Singleton
    fun provideRetrofitServices(retrofit: Retrofit) = retrofit.create<RetrofitServices>()

    @Provides
    @Singleton
    fun provideJokesRepository(retrofitServices: RetrofitServices) = JokesRepositoryImpl(retrofitServices)

    @Provides
    @Singleton
    fun provideGetJokesUseCase(jokesRepository: JokesRepository) = GetJokesUseCase(jokesRepository)

    @Provides
    fun provideRetrofit(baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}