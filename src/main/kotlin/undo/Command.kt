package undo

interface Command {
    fun execute()
    fun undo()
}