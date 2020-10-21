package com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.usecases

import com.anncode.jetpackcomposecleanarchitecture.presentation.CatFactStates

/**
 * Created by anahi.salgado on 28/07/2020
 */
interface GetCatRandomFact {
    suspend operator fun invoke(): CatFactStates
}
