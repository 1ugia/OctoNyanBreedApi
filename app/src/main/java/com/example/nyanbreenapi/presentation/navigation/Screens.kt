package com.example.nyanbreenapi.presentation.navigation

import com.example.nyanbreenapi.network.dependanceInject.ApiModule.IMAGE_URL

open class Screens (
    val route :String, //what page it's going
    val arguments: String? = null, //e.g = page selection for cat breed chosen
) {
    object CatBreedHomeScreen: Screens(
        route = "Home_screen",
        // no need for argument as it's a default to the Home_screen
    )

    object BreedsImageScreen: Screens(
        route = "$IMAGE_URL{imageId}"
        // no need to 'hard code' arguments in as it can be added in when opening the route.
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