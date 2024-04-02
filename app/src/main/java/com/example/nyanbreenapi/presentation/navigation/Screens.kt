package com.example.nyanbreenapi.presentation.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.nyanbreenapi.network.dependanceInject.ApiModule.BASE_URL
import com.example.nyanbreenapi.network.dependanceInject.ApiModule.BREED_URL
import com.example.nyanbreenapi.network.dependanceInject.ApiModule.IMAGE_URL

open class Screens(
    val route:String, //what page it's going
    val arguments: List<NamedNavArgument>? = null, //e.g = page selection for cat breed chosen
//    val arguments: String? = null,
) {
    object CatBreedHomeScreen: Screens(
        route = "Home_screen",
        // no need for argument as it's a default to the Home_screen
        ) {

    }

    object BreedsImageScreen: Screens(
        route = "$IMAGE_URL{imageId}",
        // no need to 'hard code' arguments in as it can be added in when opening the route.
        arguments = listOf(
            navArgument("CatImages") {
                type = NavType.StringType
            }
        )

        )

    fun withArgs(vararg args: String): String {
        // it can take more than one argument that can be loads of individual info rather than set lists
        return buildString {
            append(route) // append is creating url stings
            args.forEach {
                    arg -> append("/$arg")
            }
        }
    }
}