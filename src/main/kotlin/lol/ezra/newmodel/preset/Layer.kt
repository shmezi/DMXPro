package lol.ezra.newmodel.preset

import lol.ezra.newmodel.Opacity

/**
 * A layer that is used in a show. ( This is equivalent to presets in other console software)
 * @param states The individual fixture states of each of the fixtures
 */
class Layer(val states: MutableList<FixtureState>, val opacity: Opacity) {
}