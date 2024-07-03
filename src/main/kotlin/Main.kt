import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import lol.ezra.Theme
import lol.ezra.ui.gridded.Grid
import lol.ezra.ui.gridded.GridContext

fun main() = application {
   Window(onCloseRequest = ::exitApplication) {
      Theme {
         Grid(modifier = Modifier.background(Color.Cyan), GridContext(30, 6)) {
            Cell(0, 0) {
               Column {
                  Text("Box a with some cool shit here!!!")
                  Text("Another text is here :)")
                  Button({}) { Text("Click me here!") }
               }
            }
            Cell(3, 5, 4,3) {
               Column {
                  Text("Box c with some cool shit here!!!")
                  Text("Another text is here :)")
                  Button({}) { Text("Click me here!") }
               }
            }
            Cell(0, 2, 4,1) {
               Column {
                  Text("Box c with some cool shit here!!!")
                  Text("Another text is here :)")
                  Button({}) { Text("Click me here!") }
               }
            }
            Cell(0, 1, 4,1) {
               Column {
                  Text("Box c with some cool shit here!!!")
                  Text("Another text is here :)")
                  Button({}) { Text("Click me here!") }
               }
            }
         }
      }
   }

}
