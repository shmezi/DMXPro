package lol.ezra.model.fixture

/**
 * API for actual DMX outputs
 */
class Universe {
   private val fixtures = mutableListOf<DMXFixture>()
   fun assignFixture(fixture: DMXFixture) {
//      if (getFixture(fixture.range.start)) fixtures.add(fixture)
      fixtures.sortBy { it.range.first }
   }

   fun deleteFixture() {

   }

   /**
    * Returns the fixture at a given DMX address
    */
   fun getFixture(address: Int): Int {
      val big = fixtures.size - 1
      val small = 0
      var index = big / 2
      var cell = fixtures[index].range
      while (!cell.contains(small)) {
         if (cell.first > address)
            index /= 2
         else
            index = (big - index / 2)
         cell = fixtures[index].range
      }
      return fixtures[index].id
   }

   fun getChannel(id: Int) {}
}