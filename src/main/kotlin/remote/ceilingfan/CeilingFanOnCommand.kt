package remote.ceilingfan

import remote.Command


class CeilingFanOnCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.high()
    }
}
