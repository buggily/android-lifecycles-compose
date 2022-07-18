package com.buggily.skeleton.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()) {
    val value: String by viewModel.value.observeAsState(String())

    HomeScreen(
        value = value,
        onValueChange = { viewModel.onValueChange(it) },
    )
}

@Composable
private fun HomeScreen(
    value: String,
    onValueChange: (String) -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center),
        ) {
            HomeText(value)

            HomeTextField(
                value = value,
                onValueChange = onValueChange,
            )
        }
    }
}

@Composable
private fun HomeText(value: String) {
    Text(value)
}

@Composable
private fun HomeTextField(
    value: String,
    onValueChange: (String) -> Unit,
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
    )
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
