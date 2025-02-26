package lol.ezra.dmxpro.control.model

import kotlinx.serialization.Serializable
import lol.ezra.dmxpro.ui.display.Display

data class ShowFile(
   val version: Int,
   val displays: MutableMap<String, Display>
)