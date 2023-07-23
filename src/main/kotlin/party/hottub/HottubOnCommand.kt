package party.hottub

import party.Command

class HottubOnCommand(private val hottub: Hottub) : Command {
    override fun execute() {
        hottub.on()
        hottub.temperature = 104
        hottub.circulate()
    }

    override fun undo() {
        hottub.off()
    }
}
