import androidx.compose.ui.window.application
import lol.ezra.ui.display.Display
import lol.ezra.ui.display.DisplayManager
import lol.ezra.ui.display.gridded.defined.ParamChooser
import lol.ezra.ui.display.gridded.defined.ParameterPage

fun main() = application {

   DisplayManager.create(Display("A") {
      ParameterPage(x = 0, y = 0, context = this)
      ParamChooser(x = 10, y = 10, context = this) {}
   })
   DisplayManager.create(Display("B") {
      ParameterPage(x = 0, y = 0, context = this)
      ParamChooser(x = 10, y = 10, context = this) {}
   })
}
