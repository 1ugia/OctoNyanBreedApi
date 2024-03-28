package com.example.nyanbreenapi.presentation.homeSceen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nyanbreenapi.network.model.CatBreedListEntry
import com.example.nyanbreenapi.presentation.navigation.Screens

@Composable
fun CatBreedHomeScreen(
    navController: NavController,
) {
    Surface(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            Modifier.padding(16.dp)
        ) {
            Text(
                text = "Select your Cat Breed!",
            )

            // LET IT DUPLICATE dependnig on how many breeds show from api call
            Button(onClick = {
//                onBreedClick.invoke()
            },
                Modifier.shadow(5.dp, CircleShape),) {
                Text(text = "Cats") //implement cat names or id
            }
        }


    }

    @Composable
    fun CatBreedEntry(
        entry: CatBreedListEntry,
        navController: NavController,
        modifier: Modifier = Modifier,
        viewModel: CatBreedHomeScreenViewModel
    ){
        val defaultDominantColor = MaterialTheme.colorScheme.surface
        }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .shadow(5.dp, RoundedCornerShape(10.dp))
            .clickable {
                navController.navigate(
                    Screens.CatBreedHomeScreen.route
                )
            }
    ) {}
    }
