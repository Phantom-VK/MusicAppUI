package eu.tutorials.musicappui.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import eu.tutorials.musicappui.R

@Composable
fun Browse() {
    val categories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(categories) { category ->
            BrowserItem(category, R.drawable.baseline_apps_24)
        }
    }
}
