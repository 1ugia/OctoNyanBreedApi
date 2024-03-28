package com.example.nyanbreenapi.network.model

import com.google.gson.annotations.SerializedName

data class CatBreedModel(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,
)
