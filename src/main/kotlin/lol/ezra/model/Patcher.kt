package lol.ezra.model

import lol.ezra.model.fixture.FixtureBrand
import lol.ezra.model.fixture.FixtureType

class Patcher(val banks: MutableList<FixtureBrand>) {
   /**
    * Patched fixtures, dmx channel assignment is done by another process, internally we use an ID as the channel of the fixture
    * ID of fixture | Fixture type ID
    * */

   private val patched = mutableMapOf<Int, String>()

   /**
    * Each show file stores a list of fixture types that are taken from the local fixture bank.
    * This makes sure that the same show file will function the same on multiple machines.
    * Please makes sure in the future to make it not able to add remove without safety of this.
    */
   val fixtureBank = mutableMapOf<String, FixtureType>()
}