package lol.ezra.model.preset

import lol.ezra.model.Opacity

data class Preset(

   val fixtures: MutableMap<Int, FixturePreset>,
   val opacity: Opacity
)