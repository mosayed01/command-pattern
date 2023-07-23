package party

interface Command {
    fun execute()
    fun undo()
}