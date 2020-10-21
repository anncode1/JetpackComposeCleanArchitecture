package com.anncode.jetpackcomposecleanarchitecture.di

import com.anncode.jetpackcomposecleanarchitecture.data.network.CatFactsService
import com.anncode.jetpackcomposecleanarchitecture.data.network.repository.CatFactRepositoryImpl
import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.repository.CatFactRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

/**
 * Created by anahi.salgado on 17-Oct-20.
 */
@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideCatFactRepository(
        catFactsService: CatFactsService
    ): CatFactRepository = CatFactRepositoryImpl(catFactsService)
}
