package com.example.musicplaylistmannagerapp
// Leander Hughes ST10471529
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedView : AppCompatActivity() {

    //Declaring the variables
    private lateinit var displaySongs: Button
    private lateinit var CalulateAndDisplay: Button
    private lateinit var btnReturn: Button
    private lateinit var displayRating: TextView
    private lateinit var displayListSongs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)

        // Initialize views
        displaySongs = findViewById(R.id.displaySongs)
        CalulateAndDisplay = findViewById(R.id.CalulateAndDisplay)
        btnReturn = findViewById(R.id.btnReturn)
        displayRating = findViewById(R.id.displayRating)
        displayListSongs = findViewById(R.id.diplayListSongs)

        displaySongs.setOnClickListener {
            // Handle the click event for displaySongs button
            for (i in 1..4) {
            }
        }

        CalulateAndDisplay.setOnClickListener {
            // Handle the click event for CalulateAndDisplay button
        }

        btnReturn.setOnClickListener {
            // Handle the click event for btnReturn button
            // Takes the user to the main screen
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }
}