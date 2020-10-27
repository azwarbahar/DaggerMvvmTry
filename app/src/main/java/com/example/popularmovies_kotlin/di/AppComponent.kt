package com.example.popularmovies_kotlin.di

import android.content.Context
import com.example.popularmovies_kotlin.MainActivity
import com.example.popularmovies_kotlin.di.modules.ApiModule
import com.example.popularmovies_kotlin.di.modules.AppModule
import com.example.popularmovies_kotlin.ui.detail.DetailFragment
import com.example.popularmovies_kotlin.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ApiModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: HomeFragment)
    fun inject(fragment: DetailFragment)

}