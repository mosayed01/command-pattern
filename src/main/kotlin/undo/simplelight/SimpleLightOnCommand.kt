package undo.simplelight

import undo.Command


class SimpleLightOnCommand(private val light: SimpleLight) : Command {

    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}

