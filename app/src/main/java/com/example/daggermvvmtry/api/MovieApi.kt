package com.example.daggermvvmtry.api

import com.example.daggermvvmtry.data.model.Result
import com.example.daggermvvmtry.data.model.ResultWrapper
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieApi {

    @GET("4/discover/movie?sort_by=popularity.desc")
    suspend fun getTopMovies(): ResultWrapper<Result>


    @GET("3/movie/{movieId}")
    suspend fun getMovieDetails(@Path("movieId") movieId: Int): Result


}