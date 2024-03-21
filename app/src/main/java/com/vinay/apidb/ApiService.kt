package com.vinay.apidb

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create()).build()

val recipeService = retrofit.create(ApiService::class.java)


interface ApiService {
    // Get Data in android
    @GET("categories.php")

    // suspend is a async fun
    suspend fun getCategories():CategoriesResponse
}