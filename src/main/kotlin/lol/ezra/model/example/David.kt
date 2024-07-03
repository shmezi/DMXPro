package lol.ezra.model.example

class World(w: World.() -> Unit){
   val light = 10
}

fun forLoop(d: DavidContext.() -> Unit, ds: DavidContext.() -> Unit) {}
infix fun Int.until(k: Int): DavidContext.() -> Unit = {}
class DavidContext()