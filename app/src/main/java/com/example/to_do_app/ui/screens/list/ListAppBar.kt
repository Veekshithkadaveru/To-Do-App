package com.example.to_do_app.ui.screens.list

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListAppBar() {
    DefaultListAppBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = Color.White
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}

@Composable
@Preview
fun DefaultListAppBarPreview() {
    DefaultListAppBar()
}