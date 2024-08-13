package com.example.to_do_app.navigation

import androidx.navigation.NavHostController
import com.example.to_do_app.util.Action
import com.example.to_do_app.util.Constants.LIST_SCREEN
import com.example.to_do_app.util.Constants.SPLASH_NAME

class Screens(navController: NavHostController) {
    val splash: () -> Unit = {
        navController.navigate("list/${Action.NO_ACTION.name}") {
            popUpTo(SPLASH_NAME) { inclusive = true }
        }
    }
    val list: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")

    }
    val task: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
}