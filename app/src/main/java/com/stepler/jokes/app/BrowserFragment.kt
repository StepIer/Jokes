package com.stepler.jokes.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels


class BrowserFragment : Fragment() {

    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}