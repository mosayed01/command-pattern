package undo.ceilingfan

import undo.Command


class CeilingFanLowCommand(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed = ceilingFan.speed

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.low()
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