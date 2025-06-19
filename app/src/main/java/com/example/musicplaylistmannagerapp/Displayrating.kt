package com.example.musicplaylistmannagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Displayrating : AppCompatActivity() {

    private lateinit var btnReturn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_displayrating)

        btnReturn = findViewById(R.id.btnReturn)

        btnReturn.setOnClickListener {
            val intent = Intent(this, DetailedView::class.java)
            startActivity(intent)
        }
    }
}