package com.example.daggermvvmtry.api.repository

import com.example.daggermvvmtry.api.MovieApi
import com.example.daggermvvmtry.api.model.MoviesResult
import com.example.daggermvvmtry.api.model.TrailersResult
import com.example.daggermvvmtry.ui.home.MovieApiFilter
import com.example.daggermvvmtry.Const
import kotlinx.coroutines.Deferred
import javax.inject.Inject

class MovieRepository @Inject constructor(private val movieApi: MovieApi) {

    fun getTopRatedMovies(filter: MovieApiFilter): Deferred<MoviesResult> =
        movieApi.getTopRatedMovies(
            Const.API_KEY, "en-us", filter.value,
            "false", "false", 1
        )

    fun getTrailers(id: Int): Deferred<TrailersResult> =
        movieApi.getTrailers(
            id,
            Const.API_KEY, "en-us"
        )
}