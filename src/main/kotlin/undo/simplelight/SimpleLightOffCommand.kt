package undo.simplelight

import undo.Command


class SimpleLightOffCommand(private val light: SimpleLight) : Command {

    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}
