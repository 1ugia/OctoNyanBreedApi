package com.example.nyanbreenapi.network.dependanceInject

import com.example.nyanbreenapi.network.dto.CatBreedModel
import com.example.nyanbreenapi.network.dto.CatImageModel
import com.example.nyanbreenapi.network.dependanceInject.ApiModule.BREED_URL
import com.example.nyanbreenapi.network.dependanceInject.ApiModule.IMAGE_URL
import com.example.nyanbreenapi.network.repository.CatRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
// singleton-component the modules will live as long as our application does.
object ApiModule {

    // All requests will append this base url
    const val BASE_URL = "https://api.thecatapi.com/v1"
    const val BREED_URL = "/breeds"
    const val IMAGE_URL = "https://api.thecatapi.com/v1/images/search?limit=20&api_key=live_Q9HYVzt4Cg1SGAdqUvUUA0xwbHaoulPJ0WfKxP8gixkpuTorxXJpn8Qxiy0NZsMW&breed_ids="

    @Singleton
    // Provide the client that makes the call and logs the call in the logcat
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        // logger not necessary for production, helpful for debugging
        val logger = HttpLoggingInterceptor()
        logger.setLevel(HttpLoggingInterceptor.Level.HEADERS)
        return OkHttpClient.Builder().addInterceptor(logger).build()
    }

    @Singleton
    @Provides
    fun provideCatRepository(
        api: RetrofitApi
    ) = CatRepository(api)

    // adds the call converter so that the json becomes usable
    // adds the call adapter so the response is wrapped in a Result class
    @Singleton // design pattern that takes 1 place in the memory allowing to operate on the same object everytime that we try to use it.
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): RetrofitApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(RetrofitApi::class.java)
    }
}

interface RetrofitApi {
    @GET(BREED_URL)
    suspend fun getBreeds(): List<CatBreedModel>

    @GET("$IMAGE_URL{imageId}")
    suspend fun getImage(
        //implement the image id in Path to load the images we want
        @Path("imageId") imageId: String
    ): List<CatImageModel>
}
