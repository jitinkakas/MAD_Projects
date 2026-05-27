package com.example.class2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity(){

    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        button = findViewById(R.id.b1)

        var intent = Intent(this, MainActivity :: class.java)
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}