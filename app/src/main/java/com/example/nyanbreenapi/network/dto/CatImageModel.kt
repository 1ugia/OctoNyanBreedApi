package com.example.nyanbreenapi.network.dto

import com.google.gson.annotations.SerializedName

data class CatImageModel(
    @SerializedName("height")
    val height: Int? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("width")
    val width: Int? = null,
)
