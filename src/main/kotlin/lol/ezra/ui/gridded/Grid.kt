package lol.ezra.ui.gridded

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import lol.ezra.utils.pq


@Composable
fun Grid(
   modifier: Modifier = Modifier,
   options: GridContext,
   contents: @Composable GridContext.() -> Unit
) {
   val cells = options.cells
   Layout(
      modifier = modifier,
      content = {
         options.contents()
         cells.forEach { it.build() }
      }
   ) { measurables, constraints ->
      val maxH = constraints.maxHeight
      val maxW = constraints.maxWidth
      options.setSize(maxH, maxW).pq("T")

      val values = measurables.map {
         it.measure(constraints)
      }

      layout(constraints.maxWidth - options.horizontalOffset(), constraints.maxHeight - options.verticalOffset()) {
         values.withIndex().forEach {
            val i = it.index
            val v = it.value
            val data = cells[i]
            v.place(options.cellWidth(data.x), options.cellWidth(data.y))

         }
      }
   }
}