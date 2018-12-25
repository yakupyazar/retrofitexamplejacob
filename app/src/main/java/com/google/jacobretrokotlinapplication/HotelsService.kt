package com.google.jacobretrokotlinapplication

import retrofit2.Call
import retrofit2.http.GET

interface  HotelsService{

    @GET("Antalya")
    fun getHotels(): Call<List<Hotels>>
}