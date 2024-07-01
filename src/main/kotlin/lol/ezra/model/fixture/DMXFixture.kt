package lol.ezra.model.fixture

import kotlin.math.max
import kotlin.math.min

/**
 * Represents a fixture in a [Universe].
 * @param id Internal ID of DMXFixture.
 * @param start The starting address of the fixture: [1-512]
 * @param type The type of fixture being used
 */
class DMXFixture private constructor(val id: Int, start: Int, type: FixtureType) {
   /**
    * The starting address of the fixture
    */
   val range = min(max(start, 1), 512) .. type.channels.size


   companion object {
      fun of(id: Int, start: Int, type: FixtureType): DMXFixture? {
         return if (start + type.channels.size > 512) null
         else DMXFixture(id, start, type)
      }
   }
}