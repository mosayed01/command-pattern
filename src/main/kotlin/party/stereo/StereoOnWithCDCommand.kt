package party.stereo

import party.Command

class StereoOnWithCDCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }

    override fun undo() {
        stereo.off()
    }
}
