package com.example.daggermvvmtry.di.component

import dagger.Component

@Component
interface AppComponent {

    fun newFragmentComponent(): FragmentComponent

}