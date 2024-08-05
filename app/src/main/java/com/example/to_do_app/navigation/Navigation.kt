package com.example.to_do_app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.to_do_app.navigation.destinations.listComposable
import com.example.to_do_app.navigation.destinations.taskComposable
import com.example.to_do_app.ui.viewmodels.SharedViewModel
import com.example.to_do_app.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController:NavHostController,
    sharedViewModel: SharedViewModel
){
    val screen= remember(navController){
        Screens(navController=navController)
    }
    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel=sharedViewModel

            )
        taskComposable (navigateToListScreen = screen.list)
    }
}