package com.techdoctorbd.recyclerviewwithslider.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.techdoctorbd.recyclerviewwithslider.Adapters.PlaceListAdapter
import com.techdoctorbd.recyclerviewwithslider.Helper.CenterZoom
import com.techdoctorbd.recyclerviewwithslider.Model.PlaceItem
import com.techdoctorbd.recyclerviewwithslider.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView_main)

        val layoutManager = CenterZoom(this)

        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true

        recyclerView.layoutManager = layoutManager

        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        recyclerView.isNestedScrollingEnabled = false

        val places = ArrayList<PlaceItem>()

        places.add(PlaceItem("London","Standing on the Thames River, London is the capital of England as well as the most populous city in Great Britain. The city is a confluence of the old and the new and is one of the most important tourist destinations in the entire world. It is a city with numerous attractions of all sorts including great architecture and heritage.",4.3f,"https://images.unsplash.com/photo-1513635269975-59663e0ac1ad?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80"))
        places.add(PlaceItem("Bora Bora","\"Welcome to the fantasy of a dreamy island with utmost perfectional beauty\"- This is how the pictures of Bora Bora entice you for a vacation. A part of French Polynesia, this magical island has some of the most beautiful sights to behold- a tropical island sorrounded by the amazing blue lagoon and coral reefs, accompanied by small islets (Motus) scattered around Bora Bora.",4.5f,"https://www.rotasturisticas.net/imagens/destinos/pf/large/IMGD1-159-7302-bora_bora_polinesia_francesa.jpg"))
        places.add(PlaceItem("Paris","One of the greatest art repositories in the world, harbouring artistic pedigree in the likes of Renoir, Rodin, Picasso, Monet and Van Gogh. The magnificent Louvre, exceptional impressionist collections and the Centre Pompidou's modern and contemporary art, a plethora of smaller museums showcasing collections in every genre imaginable.",4.5f,"https://s1.1zoom.me/big0/796/Sky_France_Eiffel_Tower_Silhouette_Paris_Night_520025_1280x720.jpg"))
        places.add(PlaceItem("China","China, officially the People's Republic of China, is a country in East Asia and is the world's most populous country, with a population of around 1.428 billion in 2017.",4.5f,"https://images.unsplash.com/photo-1529921879218-f99546d03a9d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80"))
        places.add(PlaceItem("New Zealand","New Zealand lies in the Pacific Ocean, to the southwest. New Zealand promises beautiful landscapes and serene, equally beautiful coastlines that you can drive along, listening to the sound of the surf. The country is also known for its adventure sports activities as well as its museums, art galleries and other heritage attractions.",4.2f,"https://images.wallpaperscraft.com/image/new_zealand_mountain_river_trail_trees_105872_1280x720.jpg"))

        recyclerView.adapter = PlaceListAdapter(this,places)
    }
}