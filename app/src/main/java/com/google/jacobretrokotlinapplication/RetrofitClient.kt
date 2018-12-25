package com.google.jacobretrokotlinapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient{
    companion object {


        fun getClient():Retrofit{
            return Retrofit.Builder()
                    //buraya sizin api url iniz gelecek, res/values'un altına atmış olduğum serviceoutput.json dosyası,
                    //sizin için örnek bir json çıktısı olacaktır.
                    .baseUrl("your api url...")
                    .addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}