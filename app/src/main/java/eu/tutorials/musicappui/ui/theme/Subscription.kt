package eu.tutorials.musicappui.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Subscription() {
    // Main column layout to hold the subscription details, centered horizontally.
    Column(
        modifier = Modifier
            .fillMaxWidth() // Fill the full width of the parent
            .padding(16.dp), // Padding around the entire column for spacing
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Title text at the top of the subscription section
        Text(
            text = "Manage Subscription",
            style = MaterialTheme.typography.h6 // Use a larger, pre-defined text style
        )

        // Card to hold the subscription details, with padding and elevation for shadow effect
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp), // Add top padding to separate the card from the title
            elevation = 4.dp
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                // Column for subscription title and plan details
                Column {
                    Text(
                        text = "Musical",
                        style = MaterialTheme.typography.h6 // Styled title text
                    )
                    // Row to align the current plan and action button horizontally
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp), // Vertical padding for spacing
                        horizontalArrangement = Arrangement.SpaceBetween // Space elements apart
                    ) {
                        // Current plan text
                        Text(text = "Free Tier")
                        // Button to navigate to the plan options
                        TextButton(onClick = { /* TODO: Implement see all plans action */ }) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(text = "See All Plans")
                                // Icon to indicate action
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                    contentDescription = "See All Plans"
                                )
                            }
                        }
                    }
                }
                // Divider to separate the sections within the card
                Divider(
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp) // Padding for spacing
                )
                // Row to display an icon and text for getting a plan
                Row(
                    modifier = Modifier.padding(vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically // Align icon and text vertically centered
                ) {
                    Icon(
                        imageVector = Icons.Default.AccountBox,
                        contentDescription = "Get a Plan"
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Space between icon and text
                    Text(text = "Get a Plan")
                }
            }
        }
    }
}
