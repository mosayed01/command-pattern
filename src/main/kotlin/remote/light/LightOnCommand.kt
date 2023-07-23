package remote.light

import remote.Command


class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }
}
