package com.example.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AnimeAdapter(var data : MutableList<Anime>) : RecyclerView.Adapter<Items>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        p1: Int
    ): Items {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return Items(v)
    }

    override fun onBindViewHolder(item: Items, index: Int) {
        var anime = data.get(index)
        item.img.setImageResource(anime.image)
        item.name.setText(anime.name)
        item.title.setText(anime.title)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}