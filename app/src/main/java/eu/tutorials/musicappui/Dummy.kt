package eu.tutorials.musicappui

import androidx.annotation.DrawableRes

/**
 * Data class representing a library item in the music app UI.
 *
 * @param icon The resource ID of the icon associated with this library item.
 * @param name The name of the library item.
 */
data class Lib(@DrawableRes val icon: Int, val name: String)

/**
 * A list of available libraries in the music app UI.
 */
val libraries = listOf(
    Lib(R.drawable.ic_playlist_green, "Playlist"),
    Lib(R.drawable.ic_microphone, "Artists"),
    Lib(R.drawable.ic_baseline_album_24, "Album"),
    Lib(R.drawable.ic_baseline_music_note_24, "Songs"),
    Lib(R.drawable.ic_genre, "Genre")
)
