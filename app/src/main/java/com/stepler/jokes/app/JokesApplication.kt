package com.stepler.jokes.app

import com.stepler.jokes.domain.ApplicationComponent
import com.stepler.jokes.domain.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class JokesApplication: DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {

        return DaggerApplicationComponent.builder().application(this).build()

    }
}