package com.anncode.jetpackcomposecleanarchitecture.presentation.ui.composables

import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import com.anncode.jetpackcomposecleanarchitecture.presentation.ui.typography

@Composable
fun CatFactText(text: String) {
    Text(
        text = text,
        style = typography.h6
    )
}
