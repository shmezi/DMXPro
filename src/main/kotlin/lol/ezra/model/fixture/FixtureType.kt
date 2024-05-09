package lol.ezra.model.fixture

/**
 * A fixture type represents a type of fixture that can be used in the real world.
 * Unlike
 */
data class FixtureType(
   val id: String,
   val channels: MutableList<String>
)
