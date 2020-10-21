package com.anncode.jetpackcomposecleanarchitecture.di

import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.repository.CatFactRepository
import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.usecases.GetCatRandomFact
import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.usecases.GetCatRandomFactImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

/**
 * Created by anahi.salgado on 17-Oct-20.
 */
@Module
@InstallIn(ActivityRetainedComponent::class)
class UseCaseModule {

    @Provides
    fun provideGetCatRandomFact(
        catFactRepository: CatFactRepository
    ): GetCatRandomFact = GetCatRandomFactImpl(catFactRepository)
}
