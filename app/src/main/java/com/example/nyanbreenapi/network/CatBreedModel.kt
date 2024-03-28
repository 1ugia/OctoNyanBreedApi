package com.example.nyanbreenapi.network

import com.google.gson.annotations.SerializedName

data class CatBreedModel(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("reference_image_id")
    val reference_image_id: String? = null,
)
