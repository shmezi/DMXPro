package lol.ezra.model.preset

import lol.ezra.newmodel.Opacity

data class Preset(

   val fixtures: MutableMap<Int, FixturePreset>,
   val opacity: Opacity
)