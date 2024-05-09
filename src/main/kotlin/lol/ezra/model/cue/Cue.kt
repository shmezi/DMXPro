package lol.ezra.model.cue

interface Cue {
   val name: String
   val presets: MutableList<String>
   fun start()
   fun pause()
   fun abort()
}