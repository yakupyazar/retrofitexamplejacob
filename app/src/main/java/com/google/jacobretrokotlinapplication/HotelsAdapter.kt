package com.google.jacobretrokotlinapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.hotels_list_item.view.*

 class HotelsAdapter(val items : ArrayList<Hotels>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
     override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         holder?.hotelName?.text = items.get(position).hotelName

     }

     override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
         ViewHolder(LayoutInflater.from(context).inflate(R.layout.hotels_list_item, p0, false))
         TODO("not ") //To change body of created functions use File | Settings | File Templates.

     }

     // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    // Inflates the item views


    // Binds each animal in the ArrayList to a view

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val hotelName = view.hotelName
}