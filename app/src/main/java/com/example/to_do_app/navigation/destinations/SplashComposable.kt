package com.example.to_do_app.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.to_do_app.ui.screens.splash.SplashScreen
import com.example.to_do_app.util.Constants

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,

    ) {
    composable(
        route = Constants.SPLASH_NAME,
    )
    {
        SplashScreen(navigateToListScreen=navigateToListScreen)
    }
}