package com.example.recylerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Items : RecyclerView.ViewHolder {

    var img : ImageView
    var name : TextView
    var title : TextView

    constructor(itemView: View) : super(itemView){
        img = itemView.findViewById(R.id.img)
        name = itemView.findViewById(R.id.name)
        title = itemView.findViewById(R.id.title)
    }
}