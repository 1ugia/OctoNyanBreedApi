package com.example.nyanbreenapi.presentation.homeSceen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

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
            Button(onClick = {
//                onBreedClick.invoke()
            }) {
                Text(text = "Books")
            }
        }


    }
}