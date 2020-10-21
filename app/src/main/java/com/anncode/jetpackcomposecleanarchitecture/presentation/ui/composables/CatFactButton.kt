package com.anncode.jetpackcomposecleanarchitecture.presentation.ui.composables

import androidx.compose.foundation.Text
import androidx.compose.material.Button
import androidx.compose.runtime.Composable

@Composable
fun CatFactButton(onClick: () -> Unit){
    Button(onClick = onClick) {
        Text(text = "Get a Cat Fact!")
    }
}
