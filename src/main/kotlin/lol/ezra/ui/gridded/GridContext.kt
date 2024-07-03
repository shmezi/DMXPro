package lol.ezra.ui.gridded

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import lol.ezra.utils.pq
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt
import lol.ezra.ui.gridded.Cell as C

/**
 * Provides a context for cells
 * @param columns The column count of the grid
 * @param rows The row count of the grid
 * @param gridHeight The height of the grid
 * @param gridWidth The width of the grid
 */
class GridContext(
   private var columns: Int,
   private var rows: Int,
   private var gridHeight: MutableState<Int> = mutableStateOf(-1),
   private var gridWidth: MutableState<Int> = mutableStateOf(-1)
) {
   val cells = mutableStateListOf<C>()
   fun setSize(height: Int, width: Int) {
      gridHeight.value = height
      gridWidth.value = width
   }

   /**
    * Get the width of cell
    */
   private fun singleCellSize() = min(gridWidth.value / max(1, columns), gridHeight.value / max(1, rows)).pq()
   fun cellWidth(width: Int) = width * singleCellSize()
   fun cellHeight(height: Int) = height * singleCellSize()

   fun horizontalOffset() = (gridWidth.value - singleCellSize() * columns)
   fun verticalOffset() = (gridHeight.value - singleCellSize() * rows)


   /**TODO Change stuff here :)
    * Represents a cell in a [Grid]
    * @param columns The amount of columns this cell takes up
    * @param rows The amount of rows this cell takes up
    * @param x The X axis position on the grid
    * @param y The Y axis position on the grid
    */
   @Composable
   fun Cell(
      x: Int,
      y: Int,
      columns: Int = 1,
      rows: Int = 1,
      modifier: Modifier = Modifier,
      color: Color = Color.Red,
      contents: @Composable BoxScope.() -> Unit
   ) {
      val c = C(
         x,
         y,
         columns,
         rows,
         this,
         modifier
            ,

         contents
      )
      cells.add(c)
   }
}