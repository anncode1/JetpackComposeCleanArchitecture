package com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.repository

import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.model.CatFactStates

/**
 * Created by anahi.salgado on 28/07/2020
 */
interface CatFactRepository {
    suspend fun getCatRandomFact(): CatFactStates
}
