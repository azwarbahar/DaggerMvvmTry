package com.example.daggermvvmtry.di.modules

import android.app.Application
import com.example.daggermvvmtry.api.MovieApi
import com.example.daggermvvmtry.Const
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
class ApiModule {

    @Provides
    @Reusable
    fun providesRetrofit(
                         okHttpClient: OkHttpClient.Builder): MovieApi =
        Retrofit.Builder()
            .baseUrl(Const.BASE_URL)
            .client(
                okHttpClient
                    .build()
            )
            .addConverterFactory( GsonConverterFactory.create(
                )
            )
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
            .create(MovieApi::class.java)

    @Provides
    @Reusable
    fun providesOkHttpClient(): OkHttpClient.Builder =
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))


}
