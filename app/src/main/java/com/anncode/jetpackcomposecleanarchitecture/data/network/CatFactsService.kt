package com.anncode.jetpackcomposecleanarchitecture.data.network

import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.model.Fact
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by anahi.salgado on 28/07/2020
 */
interface CatFactsService {
    @GET("/facts/random")
    suspend fun getCatRandomFact(): Response<Fact>
}
