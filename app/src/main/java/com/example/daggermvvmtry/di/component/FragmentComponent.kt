package com.example.daggermvvmtry.di.component

import com.example.daggermvvmtry.di.FragmentScope
import com.example.daggermvvmtry.ui.fragment.detail.MovieDetailFragment
import com.example.daggermvvmtry.ui.fragment.list.favorites.FavoriteFragment
import com.example.daggermvvmtry.ui.fragment.list.movie.MovieListFragment
import dagger.Subcomponent

@FragmentScope
@Subcomponent
interface FragmentComponent {

    fun inject(fragment: MovieListFragment)

    fun inject(fragment: FavoriteFragment)

    fun inject(fragment: MovieDetailFragment)

}