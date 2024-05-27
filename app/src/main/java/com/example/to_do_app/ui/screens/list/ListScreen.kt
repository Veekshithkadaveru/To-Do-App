package com.example.to_do_app.ui.screens.list

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.sharp.AccountBox
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListScreen(navigateToTaskScreen: (Int) -> Unit) {

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
    onFabClicked: (Int) -> Unit
){
    FloatingActionButton(onClick = {
        onFabClicked(-1)
    }) {
        Icon(imageVector = Icons.Default.Add ,
            contentDescription = "Add Button",
            tint= Color.Unspecified)
    }
}
@Composable
@Preview
private fun ListScreenPreview(){
   ListScreen(navigateToTaskScreen = {})
}
