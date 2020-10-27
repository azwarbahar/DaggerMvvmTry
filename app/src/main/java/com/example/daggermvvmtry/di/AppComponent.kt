package com.example.daggermvvmtry.di

import android.content.Context
import com.example.daggermvvmtry.MainActivity
import com.example.daggermvvmtry.di.modules.ApiModule
import com.example.daggermvvmtry.di.modules.AppModule
import com.example.daggermvvmtry.ui.detail.DetailFragment
import com.example.daggermvvmtry.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ApiModule::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: HomeFragment)
    fun inject(fragment: DetailFragment)

}