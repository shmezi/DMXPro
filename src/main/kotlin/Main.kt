import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import cafe.adriel.voyager.navigator.Navigator
import lol.ezra.DMXPro
import lol.ezra.Patcher
import lol.ezra.Theme


fun main() = application {
   Window(onCloseRequest = ::exitApplication) {
      Theme {
         Navigator(Patcher)
      }
   }
}
