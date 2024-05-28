package com.example.to_do_app.ui.screens.list

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListScreen(navigateToTaskScreen: (taskId:Int) -> Unit) {

    Scaffold(
        topBar = {
                 ListAppBar()
        },
        content = {},
        floatingActionButton = {
            ListFab (onFabClicked = navigateToTaskScreen)
        }

    )
}
@Composable
fun ListFab(
    onFabClicked: (taskId:Int) -> Unit
){
    FloatingActionButton(onClick = {
        onFabClicked(-1)
    }) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Add Button",
            tint= MaterialTheme.colorScheme.primary)
    }
}
@Composable
@Preview
private fun ListScreenPreview(){
   ListScreen(navigateToTaskScreen = {})
}
