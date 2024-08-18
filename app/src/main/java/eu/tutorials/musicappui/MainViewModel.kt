package eu.tutorials.musicappui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

/**
 * ViewModel that handles the state of the currently displayed screen.
 */
class MainViewModel : ViewModel() {

    // Holds the current screen, defaulting to the AddAccount screen.
    private val _currentScreen: MutableState<Screen> = mutableStateOf(Screen.DrawerScreen.AddAccount)

    // Publicly accessible state of the current screen.
    val currentScreen: MutableState<Screen>
        get() = _currentScreen

    /**
     * Updates the current screen.
     *
     * @param screen The new screen to display.
     */
    fun setCurrentScreen(screen: Screen) {
        _currentScreen.value = screen
    }
}
