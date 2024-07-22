package lol.ezra.dmxpro.control.command

interface Command {
   fun execute(args: List<Argument<*>>)
}