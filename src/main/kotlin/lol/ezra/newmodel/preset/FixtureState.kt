package lol.ezra.newmodel.preset

import lol.ezra.newmodel.Opacity
import lol.ezra.newmodel.PatchedFixture

/**
 * A fixture the preset values.
 * This is a Preset for an individual [PatchedFixture].
 * @param states States for each [Channel] with a [UByte] value.
 * @param opacity The [Opacity] that this fixture has on the layer.
 */
class FixtureState(
   val states: MutableMap<Channel, UByte>,
   val opacity: Opacity
)