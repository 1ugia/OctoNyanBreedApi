package com.example.nyanbreenapi.presentation.homeSceen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nyanbreenapi.network.dependanceInject.ApiModule
import com.example.nyanbreenapi.network.dto.CatBreedModel

//@Composable
//fun CatBreedHomeScreen(
//    navController: NavController,
//    viewModel: CatBreedHomeScreenViewModel = hiltViewModel(),
//) {
////    val catBreedList by remember { viewModel.catLists }
//
//    Column {
//        CatBreedHomeScreenContent(
//            viewModel = viewModel,
//            navController = navController,
//            listsViewData = CatBreedModel(
//                id = null,name = null,refImageId = null
//                )
//        )
//    }
//
//    // LET IT DUPLICATE depending on how many breeds show from api call
//
//}
//
//@Composable
//fun CatBreedHomeScreenContent(
//    viewModel: CatBreedHomeScreenViewModel? = hiltViewModel(),
//    listsViewData: CatBreedModel?,
//    navController: NavController,
//    modifier: Modifier = Modifier,
//) {
//
//    Surface(
//        Modifier
//            .fillMaxSize()
//            .background(MaterialTheme.colorScheme.background)
//    ) {
//        Column(
//            Modifier.padding(16.dp)
//        ) {
//            Text(text = "Select your Cat Breed!")
//            Button(
//                onClick = {
//                    navController.navigate("${ApiModule.IMAGE_URL}{imageId}")
//                },
//            ) {
//                Text(
//                    listsViewData?.id.toString()
//                ) //implement cat names or id
//            }
//        }
//    }
//
//
//}
//
//@Preview
//@Composable
//private fun CatBreedHomeScreenContentPreview() {
//    CatBreedHomeScreenContent(
//        navController = rememberNavController(),
//        viewModel = null,
//        listsViewData = null,
//    )
//}
