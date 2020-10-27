package com.example.daggermvvmtry.data.network

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.daggermvvmtry.data.model.Result

@Dao
interface MovieDao {

    @Insert
    suspend fun insertMovie(result: Result)

    @Update
    suspend fun updateMovie(result: Result)

    @Delete
    suspend fun deleteMovie(result: Result)

    @Query("SELECT * FROM movies WHERE id = :id")
    suspend fun getMovie(id: Int): Result?

}