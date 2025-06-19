package com.example.musicplaylistmannagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedView : AppCompatActivity() {

    private lateinit var displaySongs: Button
    private lateinit var CalulateAndDisplay: Button
    private lateinit var btnReturn: Button
    private lateinit var displayView1: TextView
    private lateinit var displayView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)

        displaySongs = findViewById(R.id.displaySongs)
        CalulateAndDisplay = findViewById(R.id.CalulateAndDisplay)
        btnReturn = findViewById(R.id.btnReturn)
        displayView1 = findViewById(R.id.displayView1)
        displayView2 = findViewById(R.id.displayView2)

        displaySongs.setOnClickListener {
            // Handle the click event for displaySongs button

        }

        CalulateAndDisplay.setOnClickListener {
            // Handle the click event for CalulateAndDisplay button
        }

        btnReturn.setOnClickListener {
            // Handle the click event for btnReturn button
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }

    }
}