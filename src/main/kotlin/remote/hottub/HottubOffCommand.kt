package remote.hottub

import remote.Command


class HottubOffCommand(private val hottub: Hottub) : Command {
    override fun execute() {
        hottub.cool()
        hottub.off()
    }
}
