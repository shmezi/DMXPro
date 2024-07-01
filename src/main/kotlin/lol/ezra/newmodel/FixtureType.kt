package lol.ezra.newmodel

import lol.ezra.newmodel.preset.Channel

/**
 * Holds data about a [Fixture].
 * @param name Name of the fixture type.
 * @param description Description of the fixture type.
 * @param channels The channels that the fixture uses.
 */
class FixtureType(
   val name: String,
   val description: String,
   val channels: List<Channel>
) {

}