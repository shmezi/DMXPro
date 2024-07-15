package lol.ezra.ui.display

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf

object DisplayManager {
   private val displays = mutableStateMapOf<String, Display>()

   fun open(id: String) {
      displays[id]?.open = true
   }

   fun close(id: String) {
      displays[id]?.open = true
   }

   @Composable
   fun create(display: Display) {
      displays[display.id] = display
      display.build()
   }
}