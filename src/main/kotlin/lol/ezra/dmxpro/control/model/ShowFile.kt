package lol.ezra.dmxpro.control.model

import lol.ezra.dmxpro.ui.display.Display

data class ShowFile(
   val version: Int,
   val displays: MutableMap<String, Display>
)