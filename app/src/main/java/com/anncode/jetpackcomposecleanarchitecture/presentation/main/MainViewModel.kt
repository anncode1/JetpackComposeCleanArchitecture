package com.anncode.jetpackcomposecleanarchitecture.presentation.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.model.CatFactStates
import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.model.Fact
import com.anncode.jetpackcomposecleanarchitecture.domain.catfacts.usecases.GetCatRandomFact
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Created by anahi.salgado on 28/07/2020
 */
class MainViewModel @ViewModelInject constructor(
    private val getCatRandomFact: GetCatRandomFact
): ViewModel() {
    private val mutableCatFact = MutableLiveData<CatFactStates>()
    val catFact: LiveData<CatFactStates>
        get() = mutableCatFact


    fun getCatFact() = viewModelScope.launch {
        val catFactStates = getCatRandomFact()
        withContext(Dispatchers.IO) {
            when (catFactStates) {
                is CatFactStates.Loading -> notifyLoadingState()
                is CatFactStates.CatFactData -> notifyCatFactState(catFactStates.fact)
                is CatFactStates.Error -> notifyErrorState(catFactStates.error)
            }
        }
    }

    private fun notifyLoadingState() {
        mutableCatFact.postValue(CatFactStates.Loading)
    }

    private fun notifyCatFactState(fact: Fact) {
        mutableCatFact.postValue(CatFactStates.CatFactData(fact))
    }

    private fun notifyErrorState(error: Throwable) {
        mutableCatFact.postValue(CatFactStates.Error(error))
    }

}
