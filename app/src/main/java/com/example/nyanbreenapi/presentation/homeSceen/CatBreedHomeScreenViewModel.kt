package com.example.nyanbreenapi.presentation.homeSceen

import androidx.lifecycle.ViewModel
import com.example.nyanbreenapi.network.repository.CatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CatBreedHomeScreenViewModel @Inject constructor(
    private val repository: CatRepository
) : ViewModel() {
}