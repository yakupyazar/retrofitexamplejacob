package com.google.jacobretrokotlinapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.hotels_list_item.view.*
//response döndükten sonra, oluşturduğumuz Hotels modelini bir adapter'a set ediyoruz.
 class HotelsAdapter(val items : ArrayList<Hotels>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
     override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         holder?.hotelName?.text = items.get(position).hotelName

     }

     override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
         //item'dan bir tane üretip, adapter'a bağladık.
         ViewHolder(LayoutInflater.from(context).inflate(R.layout.hotels_list_item, p0, false))
         TODO("not ") //To change body of created functions use File | Settings | File Templates.

     }


    override fun getItemCount(): Int {
        return items.size
    }


}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val hotelName = view.hotelName
}