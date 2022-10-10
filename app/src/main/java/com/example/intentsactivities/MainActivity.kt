package com.example.intentsactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo", "onCreate")

        val buttonNext = findViewById<Button>(R.id.buttonAvançar)

        val intent2 = Intent(this, Activity2::class.java)

        buttonNext.setOnClickListener {
            startActivity(intent2)
        }

    }
}