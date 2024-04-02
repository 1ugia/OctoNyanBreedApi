package com.example.nyanbreenapi.presentation.homeSceen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nyanbreenapi.network.dto.CatBreedModel
import com.example.nyanbreenapi.network.model.CatBreedListEntry
import com.example.nyanbreenapi.network.repository.CatRepository
import com.example.nyanbreenapi.utility.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val catRepository: CatRepository
    ) : ViewModel() {
        var catLists = mutableStateOf<List<CatBreedModel>>(listOf())

        private val _state = MutableStateFlow(emptyList<CatBreedModel>())

        val state: StateFlow<List<CatBreedModel>>
        get() = _state

        init {
            viewModelScope.launch {
                val breeds = catRepository.getBreedList()
                _state.value = breeds
            }
        }

}