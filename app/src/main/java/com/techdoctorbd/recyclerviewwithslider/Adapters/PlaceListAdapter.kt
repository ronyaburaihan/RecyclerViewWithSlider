package com.techdoctorbd.recyclerviewwithslider.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.techdoctorbd.recyclerviewwithslider.Model.PlaceItem
import com.techdoctorbd.recyclerviewwithslider.R
import kotlinx.android.synthetic.main.place_item_layout.view.*

class PlaceListAdapter(val context: Context?, private val placeItems: List<PlaceItem>): RecyclerView.Adapter<PlaceListAdapter.PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        return PlaceViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.place_item_layout,parent,false))
    }

    override fun getItemCount(): Int {
        return placeItems.size
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {

        Picasso.get().load(placeItems[position].imageUrl).into(holder.itemView.image_place_item_layout)

        holder.itemView.image_place_item_layout.resume()

        holder.itemView.title_place_item.text = placeItems[position].title
        var description = placeItems[position].description
        if (description?.length!! > 100){
            description = description.substring(0,100) + " ..."
        }
        holder.itemView.description_place_item.text = description
        holder.itemView.rating_place_item.rating = placeItems[position].rating!!
    }


    class PlaceViewHolder(view : View?): RecyclerView.ViewHolder(view!!), View.OnClickListener{

        override fun onClick(v: View?) {

        }

    }

}