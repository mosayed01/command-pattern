package party.ceilingfan

import party.Command

class CeilingFanMediumCommand(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed = CeilingFan.Speed.OFF

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.medium()
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