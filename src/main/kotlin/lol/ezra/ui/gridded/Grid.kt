package lol.ezra.ui.gridded

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout


@Composable
fun Grid(
   modifier: Modifier = Modifier,
   options: GridOptions,
   cells: MutableList<Cell>,
   content: @Composable () -> Unit
) {
   Layout(
      modifier = modifier,
      content = content
   ) { measurables, contraints ->

      val values = measurables.map {
         it.measure(contraints)
      }
      var v = 0
      layout(contraints.maxWidth, contraints.maxHeight) {
         values.forEach {
            it.place(0, v)
            v += it.height
         }
      }
   }
}