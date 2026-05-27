package com.example.class2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){

    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        button = findViewById(R.id.b1)

        var intent = Intent(this, ThirdActivity :: class.java)
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}