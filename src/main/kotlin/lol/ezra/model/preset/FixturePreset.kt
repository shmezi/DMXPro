package lol.ezra.model.preset

import lol.ezra.newmodel.Opacity

/**
 * Represents a preset for an individual fixture
 * @param values Channel to  channel value
 */
data class FixturePreset(val values: MutableMap<Int, Int>, val opacity: Opacity) {
}