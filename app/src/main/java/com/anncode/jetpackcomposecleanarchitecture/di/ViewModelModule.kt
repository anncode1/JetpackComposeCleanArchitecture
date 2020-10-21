package com.anncode.jetpackcomposecleanarchitecture.di

import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.usecases.GetCatRandomFact
import com.anncode.jetpackcomposecleanarchitecture.presentation.main.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

/**
 * Created by anahi.salgado on 17-Oct-20.
 */
@Module
@InstallIn(ActivityRetainedComponent::class)
class ViewModelModule {

    @Provides
    fun provideMainViewModel(
        getCatRandomFact: GetCatRandomFact
    ): MainViewModel = MainViewModel(getCatRandomFact)
}
