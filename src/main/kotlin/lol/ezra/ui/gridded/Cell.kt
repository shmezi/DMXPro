package lol.ezra.ui.gridded

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

/**
 * Represents a cell in a [Grid]
 * @param columns The amount of columns this cell takes up
 * @param rows The amount of rows this cell takes up
 * @param x The X axis position on the grid
 * @param y The Y axis position on the grid
 */

data class Cell(
   val x: Int,
   val y: Int,
   val columns: Int = 1,
   val rows: Int = 1,
   private val context: GridContext,
   val modifier: Modifier = Modifier,
   val contents: @Composable BoxScope.() -> Unit
) {

   @Composable
   fun build() {
      var offsetX by remember { mutableStateOf(0f) }
      var offsetY by remember { mutableStateOf(0f) }

      Box(
         modifier = modifier/*.clip(RoundedCornerShape(10))*/
            .size(context.cellWidth(columns).dp, context.cellHeight(rows).dp)

            .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
            .pointerInput(Unit) {
               detectDragGestures { change, dragAmount ->
                  change.consume()
                  offsetX += dragAmount.x
                  offsetY += dragAmount.y
               }
            }
            .background(Color.Red, RoundedCornerShape(10))
            .border(
               3.dp, Color.Black,
               RoundedCornerShape(10)
            ),
         content = contents
      )
   }

}