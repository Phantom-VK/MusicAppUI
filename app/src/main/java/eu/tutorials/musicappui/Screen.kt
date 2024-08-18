package eu.tutorials.musicappui

import androidx.annotation.DrawableRes

/**
 * Sealed class representing different screens in the music app UI.
 */
sealed class Screen(val title: String, val route: String) {

    /**
     * Represents screens available in the bottom navigation bar.
     */
    sealed class BottomScreen(
        bTitle: String, bRoute: String, @DrawableRes val icon: Int
    ) : Screen(bTitle, bRoute) {
        object Home : BottomScreen("Home", "home", R.drawable.baseline_music_video_24)
        object Library : BottomScreen("Library", "library", R.drawable.baseline_library_music_24)
        object Browse : BottomScreen("Browse", "browse", R.drawable.baseline_apps_24)
    }

    /**
     * Represents screens available in the navigation drawer.
     */
    sealed class DrawerScreen(
        dTitle: String, dRoute: String, @DrawableRes val icon: Int
    ) : Screen(dTitle, dRoute) {
        object Account : DrawerScreen("Account", "account", R.drawable.ic_account)
        object Subscription : DrawerScreen("Subscription", "subscribe", R.drawable.ic_subscribe)
        object AddAccount : DrawerScreen("Add Account", "add_account", R.drawable.baseline_person_add_alt_1_24)
    }
}

// Lists of screens for easy access in UI components
val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)
