package com.google.jacobretrokotlinapplication

import retrofit2.Call
import retrofit2.http.GET

interface  HotelsService{
    //retrofit için GET metodutunu kullancağımız interface class
    @GET("Antalya")
    fun getHotels(): Call<List<Hotels>>
}