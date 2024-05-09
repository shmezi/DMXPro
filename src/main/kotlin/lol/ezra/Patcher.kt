package lol.ezra

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

object Patcher : Screen {
   @Composable
   override fun Content() {
      Fixture("Shmezi")
   }
}