package party

class MacroCommand(private val commands: List<Command>) : Command {
    override fun execute() {
        commands.forEach(Command::execute)
    }

    override fun undo() {
        commands.forEach(Command::undo)
    }
}
