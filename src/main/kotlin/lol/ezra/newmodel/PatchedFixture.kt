package lol.ezra.newmodel

/**
 * @param address Internal address
 * @param type The Fixture type.
 * @param dmxStart The starting DMX Channel.
 */
class PatchedFixture(
   val address: Int,
   val type: FixtureType,
   dmxStart: Short
) {
   val space = dmxStart .. type.channels.size

   init {
      //Basic data validation
      if (space.last > 512 || space.first < 0) throw InvalidDMXAddressAssigned()
   }
}