package com.example.nyanbreenapi.presentation.homeSceen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nyanbreenapi.network.dto.CatBreedModel
import com.example.nyanbreenapi.network.model.CatBreedListEntry
import com.example.nyanbreenapi.network.repository.CatRepository
import com.example.nyanbreenapi.utility.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

//@HiltViewModel
//class CatBreedHomeScreenViewModel @Inject constructor(
//    private val repository: CatRepository
//) : ViewModel() {
//
////    var catLists = mutableStateOf<List<CatBreedListEntry>>(listOf())
//    var loadError = mutableStateOf("")
//    var isLoading = mutableStateOf(false)
//    var endReached = mutableStateOf(false)
//    private var cashedCatList = listOf<CatBreedListEntry>()
//    private var isSeachStarting = true
//    var isSearching = mutableStateOf(false)
//
//
//    private val _state = mutableStateOf(listOf(CatBreedModel()))}
//    private var mutableLiveData = MutableLiveData<Resource<Screens.CatBreedHomeScreen>>()

//    init {
//        loadCatPaginated()
//    }

//    fun onClick() {
//        mutableLiveData.value = Resource.Loading()
//        viewModelScope.launch {
//            repository.getCatImages("${ApiModule.IMAGE_URL}{imageId}")
//        }
//    }

//    fun searchCatList(query: String?) {
//        val listToSearch = if (isSeachStarting) {
//            catLists.value
//        } else {
//            cashedCatList
//        }
//        viewModelScope.launch(Dispatchers.Default) {
//            val catBreeds = repository.getBreedList()
//            _state.value = catBreeds
//        }
//
//            if(isSeachStarting) {
//                cashedCatList = catLists.value
//                isSeachStarting = false
//            }
////            catLists.value =
//            isSearching.value = true
//        }
//    }
