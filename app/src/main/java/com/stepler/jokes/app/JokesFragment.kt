package com.stepler.jokes.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stepler.jokes.R
import com.stepler.jokes.databinding.ActivityMainBinding
import com.stepler.jokes.databinding.ActivityMainBinding.inflate
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class JokesFragment : DaggerFragment() {

    @Inject
    lateinit var builder: MainViewModelBuilder

    private val model: MainViewModel by viewModels(factoryProducer = {builder})

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        inflater.inflate(R.layout.fragment_jokes, container, false)

        val recyclerView: RecyclerView? = view?.findViewById(R.id.recyclerView)
        recyclerView?.layoutManager = LinearLayoutManager(this.context)

        model.listJoke.observe(viewLifecycleOwner, {

        })

        return inflater.inflate(R.layout.fragment_jokes, container, false)
    }

}