package lol.ezra.model.fixture

data class FixtureBrand(
   val name: String,
   val fixtures: MutableMap<String, FixtureType>
) {
}