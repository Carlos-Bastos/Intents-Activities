package com.example.intentsactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener {
            finish()
        }
    }
}