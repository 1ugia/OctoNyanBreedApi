package com.example.nyanbreenapi.presentation.homeSceen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.nyanbreenapi.network.dto.CatBreedModel

@Composable
fun CatBreedButton(data: CatBreedModel?) {
//    val imagerPainter = rememberImagePainter(data = character.image)

    Surface(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            Modifier.padding(16.dp)
        ) {
            Text(text = "Select your Cat Breed!")
            Button(onClick = {}) {
                Text(text = "${data?.id}")
            }
        }
    }
}

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeScreenViewModel = hiltViewModel(),
) {
    val homeViewModel = viewModel(modelClass = HomeScreenViewModel::class.java)
    val state by homeViewModel.state.collectAsState()

    Column {
        state?.let {
            CircularProgressIndicator(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(align = Alignment.Center)
            )
        }
        CatBreedButton(data = CatBreedModel())
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    CatBreedButton(
        data = CatBreedModel(
            id = "Tango", name = "tango", refImageId = "X0uyt"
        ),
    )
}