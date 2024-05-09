package lol.ezra

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Fixture(id: String) = Card(shape = MaterialTheme.shapes.medium) {
   Column {
      Text(id, style = typography.h3)
   }


}