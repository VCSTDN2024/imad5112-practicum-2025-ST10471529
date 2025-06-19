package com.example.musicplaylistmannagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainScreen : AppCompatActivity() {

    private lateinit var btnAdd: Button
    private lateinit var nextScreen: Button
    private lateinit var btnExit: Button
    private lateinit var songTile: EditText
    private lateinit var artistName: EditText
    private lateinit var userComments: EditText
    private lateinit var ratings: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        btnAdd = findViewById(R.id.btnAdd)
        nextScreen = findViewById(R.id.nextScreen)
        btnExit = findViewById(R.id.btnExit)
        songTile = findViewById(R.id.songTile)
        artistName = findViewById(R.id.artistName)
        userComments = findViewById(R.id.userComments)
        ratings = findViewById(R.id.ratings)

        btnAdd.setOnClickListener {
            // Handle the click event for btnAdd button
            val title = songTile.text.toString().trim()
            val artist = artistName.text.toString().trim()
            val genre = userComments.text.toString().trim()
            val rating = ratings.text.toString().trim()

            fun showToast(s: String) {
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
            }
            if (title.isEmpty() || artist.isEmpty() || genre.isEmpty() || rating.isEmpty()) {
                showToast("Please fill all the fields")
                } else {
                showToast("Successfully added to playlists")
            }

                songTile.text.clear()
                artistName.text.clear()
                userComments.text.clear()
                ratings.text.clear()
            }

            nextScreen.setOnClickListener {
                // Handle the click event for nextScreen button
                val intent = Intent(this, DetailedView::class.java)
                startActivity(intent)
            }

            btnExit.setOnClickListener {
                // Handle the click event for btnExit button
                finishAffinity()
                exitProcess(0)
            }
        }
    }