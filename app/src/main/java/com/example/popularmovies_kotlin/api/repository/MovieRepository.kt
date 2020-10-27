package com.example.popularmovies_kotlin.api.repository

import com.example.popularmovies_kotlin.api.MovieApi
import com.example.popularmovies_kotlin.api.models.MoviesResult
import com.example.popularmovies_kotlin.api.models.TrailersResult
import com.example.popularmovies_kotlin.ui.home.MovieApiFilter
import com.example.popularmovies_kotlin.Const
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