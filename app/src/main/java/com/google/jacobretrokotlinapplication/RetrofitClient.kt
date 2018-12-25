package com.google.jacobretrokotlinapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient{
    companion object {
        fun getClient():Retrofit{
            return Retrofit.Builder()
                    .baseUrl("your api url...")
                    .addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}