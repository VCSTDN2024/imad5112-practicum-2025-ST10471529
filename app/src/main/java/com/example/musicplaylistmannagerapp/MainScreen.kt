package com.example.musicplaylistmannagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
    private lateinit var songTile: TextView
    private lateinit var artistName: TextView
    private lateinit var userComments: TextView
    private lateinit var ratings: TextView


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
            val title = songTile.text.toString()
            val artist = artistName.text.toString()
            val genre = userComments.text.toString()
            val rating = ratings.text.toString()
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

        fun showToast(message: String) {
            Toast.makeText(this, "Successfully added to playlist", Toast.LENGTH_SHORT).show()
        }

        private fun displaySongInfo() {
            songTile.text = ""

        }
        private fun displayArtistInfo() {
            artistName.text = ""
            }
        private fun displayRatings() {
            ratings.text = ""
        }
        private fun displayUserComments() {
            userComments.text = ""
        }
        showResults()
    }

    private fun showResults() {
        val intent = intent
    }
}