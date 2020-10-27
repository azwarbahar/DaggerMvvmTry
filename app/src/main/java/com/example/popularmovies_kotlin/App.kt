package com.example.popularmovies_kotlin

import android.app.Application
import com.example.popularmovies_kotlin.di.AppComponent
import com.example.popularmovies_kotlin.di.DaggerAppComponent

open class App : Application() {
    
    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }
}