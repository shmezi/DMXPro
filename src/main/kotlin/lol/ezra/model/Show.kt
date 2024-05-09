package lol.ezra.model

import lol.ezra.model.cue.Cue
import lol.ezra.model.fixture.Group
import lol.ezra.model.preset.Preset

/**
 * A show file the can be loaded
 * this file will both be serializable and be able to run after being loaded
 *
 * TODO:
 * Add author section
 * Fixtures will be stored based on a system that will be later created
 */
class Show(
   val metaData: ShowMetaData,
   private val patcher: Patcher,
   /**
    * Groups that have been defined
    */
   private val groups: MutableMap<String, Group>,
   val presets: MutableMap<String, Preset>,
   val cues: MutableMap<String, Cue>
) {


   fun serialize() {}
   fun desierilize() {}
}