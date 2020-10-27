package com.example.daggermvvmtry.ui.fragment.list.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.daggermvvmtry.R
import com.example.daggermvvmtry.data.model.Result
import com.example.daggermvvmtry.ui.adapter.MovieListAdapter
import javax.inject.Inject

class MovieListViewModel  : Fragment(), MovieListAdapter.OnItemClickListener{

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    private val viewModel : MovieListViewModel by viewModels(factoryProducer = {factory} )

    private val movieAdapter = MovieListAdapter();

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }


    override fun onItemClicked(movie: Result) {
        TODO("Not yet implemented")
    }
}