package com.buggily.skeleton.ui.main

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.buggily.skeleton.ui.home.HomeScreen

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
