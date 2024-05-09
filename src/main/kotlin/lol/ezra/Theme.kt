package lol.ezra

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun Theme(content: @Composable (() -> Unit)) =
   MaterialTheme(
//      typography = Typography(h1 = TextStyle(fontSize = 13.sp, color = Color.Red)),
      content = content
   )