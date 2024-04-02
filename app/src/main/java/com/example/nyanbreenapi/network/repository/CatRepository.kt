package com.example.nyanbreenapi.network.repository

import com.example.nyanbreenapi.network.dependanceInject.RetrofitApi
import com.example.nyanbreenapi.network.dto.CatBreedModel
import com.example.nyanbreenapi.network.dto.CatImageModel
import com.example.nyanbreenapi.utility.Resource
import javax.inject.Inject

//Injects to view Model

class CatRepository @Inject constructor(
    private val retrofitApi: RetrofitApi,
) {
//    private var cashedCatBreed: List<CatBreedModel>? = null
//    private var cashedCatImage: List<CatImageModel>? = null

    suspend fun getBreedList(): List<CatBreedModel> {
//        val response = try {
            return retrofitApi.getBreeds()
//        } catch (e: Exception) {
//            return Resource.Error("Could not load cat breeds")
//        }
//        return Resource.Success(response)
    }

    suspend fun getCatImages(imageId: String): Resource<List<CatImageModel>> {
        val response = try {
            retrofitApi.getImage(imageId)
        } catch (e: Exception) {
            return Resource.Error("Could not load cat images")
        }
        return Resource.Success(response)
    }

}