package com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.usecases

import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.model.CatFactStates
import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.repository.CatFactRepository

/**
 * Created by anahi.salgado on 28/07/2020
 */
class GetCatRandomFactImpl(
    private val catFactRepository: CatFactRepository
): GetCatRandomFact {
    override suspend fun invoke(): CatFactStates = catFactRepository.getCatRandomFact()
}
