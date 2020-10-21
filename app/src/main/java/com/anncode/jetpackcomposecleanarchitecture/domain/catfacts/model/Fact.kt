package com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.model

import com.google.gson.annotations.SerializedName

/**
 * Created by anahi.salgado on 28/07/2020
 */
data class Fact(
    @SerializedName("_id") val id: String,
    @SerializedName("text") val text: String
)
