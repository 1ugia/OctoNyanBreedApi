package com.example.nyanbreenapi.network.dto

import com.google.gson.annotations.SerializedName

data class CatBreedModel(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("reference_image_id")
    val refImageId: String? =null,
)
