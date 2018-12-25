package com.google.jacobretrokotlinapplication

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_hotels_list.layoutManager= LinearLayoutManager(this)

        RetrofitClient.getClient().create(HotelsService::class.java)
                .getHotels().enqueue(object :retrofit2.Callback<List<Hotels>>
                {
                    override fun onResponse(call: Call<List<Hotels>>?, response: Response<List<Hotels>>?) {
                      val hotellist=ArrayList(response?.body())
                        Toast.makeText(this@MainActivity,"Otel Listesi Çekildi",Toast.LENGTH_SHORT).show()
                        rv_hotels_list.adapter=HotelsAdapter(hotellist,getApplicationContext())
                    }

                    override fun onFailure(call: Call<List<Hotels>>?, t: Throwable?) {
                        Toast.makeText(this@MainActivity,"Otel Listesi Alınamadı",Toast.LENGTH_SHORT).show()
                    }


                })


    }


}
