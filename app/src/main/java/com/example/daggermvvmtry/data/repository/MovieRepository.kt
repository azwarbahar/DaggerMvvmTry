package com.example.daggermvvmtry.data.repository

import com.example.daggermvvmtry.api.MovieApi
import com.example.daggermvvmtry.data.model.Result
import com.example.daggermvvmtry.data.network.MovieDao
import javax.inject.Inject

class MovieRepository
@Inject constructor(
    private val movieDao: MovieDao,
    private val movieApi: MovieApi
){

    suspend fun insertMovie(result: Result){
        movieDao.insertMovie(result)
    }

    suspend fun updateMovie(result: Result){
        movieDao.insertMovie(result)
    }

    suspend fun deleteMovie(result: Result){
        movieDao.insertMovie(result)
    }

    suspend fun getMovieDetails(id: Int) = movieDao.getMovie(id)

    suspend fun isMovieFavorite(id: Int) = movieDao.getMovie(id) != null

    fun getFavoriteMovies() = movieDao.getAllMovies()

    suspend fun fetchTopMovies() = movieApi.getTopMovies().results

    suspend fun fetchMovieDetails(id: Int) = movieApi.getMovieDetails(id)
}