package remote.light

import remote.Command


class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }
}
