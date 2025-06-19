package com.example.musicplaylistmannagerapp

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {

    private lateinit var btnAdd: Button
    private lateinit var nextScreen: Button
    private lateinit var btnExit: Button
    private lateinit var songTile: TextView
    private lateinit var artistName: TextView
    private lateinit var userComments: TextView
    private lateinit var rating1: RadioButton
    private lateinit var rating2: RadioButton
    private lateinit var rating3: RadioButton
    private lateinit var rating4: RadioButton
    private lateinit var rating5: RadioButton

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
        rating1 = findViewById(R.id.rating1)
        rating2 = findViewById(R.id.rating2)
        rating3 = findViewById(R.id.rating3)
        rating4 = findViewById(R.id.rating4)
        rating5 = findViewById(R.id.rating5)
        }
    }
}