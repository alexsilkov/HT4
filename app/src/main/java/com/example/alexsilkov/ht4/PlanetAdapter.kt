package com.example.alexsilkov.ht4

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.item.view.*

class PlanetAdapter(var data:Array<Planet>):RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {
    override fun getItemCount() = data.size



    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.planetView.setImageResource(data[position].planetVision)
        holder.liveView.setImageResource(data[position].liveIcon)
        holder.planetText.text = data[position].planetName
        holder.distanseText.text = data[position].distance

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            PlanetViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))

    class PlanetViewHolder(var view:View):RecyclerView.ViewHolder(view){
         var planetView:ImageView = view.planet_view
         var liveView:ImageView = view.live_view
         var planetText:TextView = view.item_planet_text
         var distanseText:TextView = view.distance_text
    }

}