package undo.ceilingfan

import undo.Command


class CeilingFanHighCommand(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed = ceilingFan.speed

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.high()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.Speed.HIGH -> ceilingFan.high()
            CeilingFan.Speed.MEDIUM -> ceilingFan.medium()
            CeilingFan.Speed.LOW -> ceilingFan.low()
            CeilingFan.Speed.OFF -> ceilingFan.off()
        }
    }
}
