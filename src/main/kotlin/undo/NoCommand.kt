package undo

class NoCommand : Command {
    override fun execute() {}
    override fun undo() {}
}

