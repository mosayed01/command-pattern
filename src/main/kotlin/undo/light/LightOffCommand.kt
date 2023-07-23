package undo.light

import undo.Command


class LightOffCommand(private val light: Light) : Command {
    private var level = 0

    override fun execute() {
        level = light.level
        light.off()
    }

    override fun undo() {
        light.dim(level)
    }
}
