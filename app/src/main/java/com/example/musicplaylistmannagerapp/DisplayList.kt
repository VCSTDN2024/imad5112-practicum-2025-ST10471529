package com.example.musicplaylistmannagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DisplayList : AppCompatActivity() {

    private lateinit var textView2: TextView
    private lateinit var btnReturn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display_list)

        textView2 = findViewById(R.id.textView2)
        btnReturn = findViewById(R.id.btnReturn)

        val title = intent.getStringExtra("title")
        val artist = intent.getStringExtra("artist")
        val genre = intent.getStringExtra("genre")
        val rating = intent.getStringExtra("rating")


        btnReturn.setOnClickListener {
            val intent = Intent(this, DetailedView::class.java)
            startActivity(intent)
        }
    }
}