import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import cafe.adriel.voyager.navigator.Navigator
import lol.ezra.Display
import lol.ezra.Theme

fun main() = application {
   Window(onCloseRequest = ::exitApplication) {
      Theme {
         Navigator(Display("test"))
      }
   }
}
