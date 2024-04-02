package com.example.nyanbreenapi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.nyanbreenapi.network.dependanceInject.ApiModule
import com.example.nyanbreenapi.presentation.homeSceen.HomeScreen
import com.example.nyanbreenapi.presentation.homeSceen.HomeScreenViewModel
import dagger.hilt.android.AndroidEntryPoint

@Composable
//control all the navigation in the app and let Main activity less heavy
fun Navigation(){
    val navController = rememberNavController()
    NavHost( //all screen are composable and no fragments needed. just define what screens we have.
        navController = navController,
        startDestination = Screens.CatBreedHomeScreen.route
    ){
        // everytime you add a screen, add the route to the screen
        // it runs the 'start destination' when the app is opened
        // A surface container using the 'background' color from the theme
        composable(
            Screens.CatBreedHomeScreen.route) {
            val viewModel = hiltViewModel<HomeScreenViewModel>()
            HomeScreen(
                navController = navController,
            )
        }
//        ) {Screens.CatBreedHomeScreen.route(navController = navController)}
        composable( "${ApiModule.IMAGE_URL}{imageId}",
            arguments = listOf(
                navArgument("imageId") {
                    type = NavType.StringType
                }
            )
//            Screens.BreedsImageScreen.route
        ) {
            val catImageId = remember {
                it.arguments?.getString("imageId")
            }
        }
    }
}