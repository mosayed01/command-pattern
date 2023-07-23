package party.light

import party.Command


class LightOnCommand(private val light: Light) : Command {
    private var level = 0

    override fun execute() {
        level = light.level
        light.on()
    }

    override fun undo() {
        light.dim(level)
    }
}

