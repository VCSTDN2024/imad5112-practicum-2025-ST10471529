package com.example.musicplaylistmannagerapp

object playlistmanager {

    private const val max_items = 4
    private val song = mutableListOf<String>()
    private val artist = mutableListOf<String>()
    private val genre = mutableListOf<String>()
    private val rating = mutableListOf<String>()

    fun add(song: String, artist: String, genre: String, rating: String) {
        if (this.song.size >= max_items) {
            if (song.isNotEmpty()) {
                //ensures that the lists are empty before removing
                this.song.removeAt(0)
                this.artist.removeAt(0)
                this.genre.removeAt(0)
                this.rating.removeAt(0)
            }
        }
        this.song.add(song)
        this.artist.add(artist)
        this.genre.add(genre)
        this.rating.add(rating)
    }

    data class Song(val song: String, val artist: String, val genre: String, val rating: String)

    fun getAverageRating(): Double {
        if (rating.isEmpty()) {
            return 0.0
        }
        val numericRating = rating.mapNotNull { it.toDoubleOrNull() }
    }

    fun getAllSongs(): List<Song> {
        val song = mutableListOf<Song>()
        for (i in 0 until song.size) {
            song.add(Song(song[i], artist[i], genre[i], rating[i]))
        }
        return song
    }
    private fun clearPlaylist() {
        this.song.clear()
        this.artist.clear()
        this.genre.clear()
        this.rating.clear()
    }
}