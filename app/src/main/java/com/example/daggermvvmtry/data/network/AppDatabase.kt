package com.example.daggermvvmtry.data.network

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities = [Result::class])
abstract class AppDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao
}