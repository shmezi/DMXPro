package lol.ezra.model

import kotlin.math.max
import kotlin.math.min

/**
 * The opacity of something.
 * Opacity is stored as a float from 0..1.
 */
class Opacity private constructor(private var opacity: Float) {
   /**
    * Set the opacity level.
    * @param value New Opacity
    */
   fun set(value: Float) {
      opacity = max(min(1f, value), 0f)
   }

   /**
    * Get the opacity level.
    * @return The opacity.
    */
   fun get() = opacity

   companion object {
      private fun valid(value: Float) = max(min(1f, value), 0f)

      /**
       * Create a new opacity of a given float
       */
      fun of(value: Float) = Opacity(valid(value))
   }
}

