package party.tv

import party.Command

class TVOnCommand(private val tv: TV) : Command {
    override fun execute() {
        tv.on()
        tv.setInputChannel()
    }

    override fun undo() {
        tv.off()
    }
}

