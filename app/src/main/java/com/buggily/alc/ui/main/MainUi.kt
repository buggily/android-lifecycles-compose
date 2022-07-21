package com.buggily.alc.ui.main

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.buggily.alc.ui.home.HomeScreen

@Composable
fun MainScreen() {
    MaterialTheme {
        HomeScreen()
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}
