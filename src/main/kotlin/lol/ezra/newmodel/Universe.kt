package lol.ezra.newmodel

/**
 *
 * The universe system employs a layer based system, NO DATA IS STORED OTHER THEN PATCHING DETAILS
 * Since the system works based on layers it would be stupid to store data per node, instead a general panel regarding all values is created.
 *
 * Internal IDS are stored based on Universe-FixtureID to better sort the data.
 */
class Universe(val id: String) {

   private val patched = mutableMapOf<Int, PatchedFixture>()

   /**
    *
    */
   operator fun get(dmx: Short): PatchedFixture? {
      for (fixture in patched.values) {
         if (fixture.space.contains(dmx))
            return fixture
      }
      return null
   }
   
}