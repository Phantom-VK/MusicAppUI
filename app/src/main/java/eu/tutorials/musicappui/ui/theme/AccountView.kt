package eu.tutorials.musicappui.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * Composable function to display the account view.
 */
@Composable
fun AccountView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    modifier = Modifier.padding(end = 8.dp)
                )
                Column {
                    Text("Panjutorials")
                    Text("@tutorialsEU")
                }
            }
            IconButton(onClick = { /* Handle click action */ }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Navigate"
                )
            }
        }

        Spacer(modifier = Modifier.padding(top = 16.dp))

        Row {
            Icon(
                painter = painterResource(id = eu.tutorials.musicappui.R.drawable.baseline_music_video_24),
                contentDescription = "My Music",
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = "My Music")
        }
        Divider(modifier = Modifier.padding(top = 8.dp))
    }
}
