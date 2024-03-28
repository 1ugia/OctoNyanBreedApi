package com.example.nyanbreenapi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
//control all the navigation in the app and let Main activity less heavy
fun Navigation(){
    val navController = rememberNavController()
    NavHost( //all screen are composables and no fragments needed. just define what screens we have.
        navController = navController,
        startDestination = Screens.CatBreedHomeScreen.route
    ){
        // everytime you add a screen, add the route to the screen
        // it runs the 'start destination' when the app is opened
        // A surface container using the 'background' color from the theme
        composable(
            Screens.CatBreedHomeScreen.route
        ) {}
        composable(
            Screens.BreedsImageScreen.route
        ) {}
    }
}