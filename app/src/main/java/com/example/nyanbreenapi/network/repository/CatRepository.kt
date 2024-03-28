package com.example.nyanbreenapi.network.repository

import com.example.nyanbreenapi.network.dependanceInject.RetrofitApi
import com.example.nyanbreenapi.network.dto.CatBreedModel
import com.example.nyanbreenapi.network.dto.CatImageModel
import com.example.nyanbreenapi.utility.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

//Injects to view Model

@ActivityScoped

// scoping will make this alive as long as the activity does

class CatRepository @Inject constructor(
    private val retrofitApi: RetrofitApi,
) {

//    private var cashedCatBreed: List<CatBreedModel>? = null
//    private var cashedCatImage: List<CatImageModel>? = null

    suspend fun getBreeds(): Resource<List<CatBreedModel>> {
        val response = try {
            retrofitApi.getBreeds()
        } catch (e: Exception) {
            return Resource.Error("Could not load cat breeds")
//        return cashedCatBreed?. let { Result.success(it) } ?: retrofitApi.getBreeds().onSuccess {
//            cashedCatBreed = it
        }
        return Resource.Success(response)
    }

    suspend fun getCatImages(imageId: String): Resource<List<CatImageModel>>? {
//        return cashedCatImage?. let { Result.success(it) } ?: retrofitApi.getImage(imageId).onSuccess {
//            cashedCatImage = it
        val response = try {
            retrofitApi.getImage(imageId)
        } catch (e: Exception) {
            return Resource.Error("Could not load cat images")
//        return cashedCatBreed?. let { Result.success(it) } ?: retrofitApi.getBreeds().onSuccess {
//            cashedCatBreed = it
        }
        return Resource.Success(response)
        }

}