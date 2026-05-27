package com.example.recylerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    var data = mutableListOf<Anime>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.rec)
        recyclerView.layoutManager = LinearLayoutManager(this)

        data.add(Anime("The Last Of Us - II", "Joel Miller", R.drawable.img))
        data.add(Anime("The Last Of Us - II", "Ellie Williams", R.drawable.img_3))
        data.add(Anime("God Of War", "Kratos", R.drawable.img_4))
        data.add(Anime("Red Dead Redemption 2", "Arthur Morgan", R.drawable.img_5))
        data.add(Anime("Ghost of Tsushima", "The Ghost(Jin Sakai)", R.drawable.img_6))
        data.add(Anime("Resident Evil Requiem", "Leon Scott Kennedy", R.drawable.img_7))
        data.add(Anime("Marvel's Spider-Man 2", "Peter Parker", R.drawable.img_1))
        data.add(Anime("The Witcher 3: Wild Hunt", "Geralt of Rivia", R.drawable.img_2))

        recyclerView.adapter = AnimeAdapter(data)
    }
}
