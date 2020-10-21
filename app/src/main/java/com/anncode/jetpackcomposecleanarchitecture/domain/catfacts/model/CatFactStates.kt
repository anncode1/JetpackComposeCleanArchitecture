package com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.model

/**
 * Created by anahi.salgado on 28/07/2020
 */
sealed class CatFactStates {
    object Loading: CatFactStates()
    class CatFactData(val fact: Fact): CatFactStates()
    class Error(val error: Throwable): CatFactStates()
}
