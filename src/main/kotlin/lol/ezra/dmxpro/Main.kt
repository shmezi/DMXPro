package lol.ezra.dmxpro

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import lol.ezra.dmxpro.ui.display.gridded.cells.ParameterPage
import lol.ezra.dmxpro.ui.display.gridded.grid.GridContext.Companion.Grid

fun main() = application {
   Window(onCloseRequest = {}) {
      Grid(columns = 30, rows = 30) {
         ParameterPage(x = 0, y = 0, context = this)
         ParameterPage(x = 0, y = 10, context = this)

      }
   }
}