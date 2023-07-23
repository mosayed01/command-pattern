package party.ceilingfan

import party.ceilingfan.CeilingFan.Speed.*

class CeilingFan(private val location: String) {
    var speed: Speed = OFF
        private set

    fun high() {
        speed = HIGH
        println("$location ceiling fan is on high")
    }

    fun medium() {
        speed = MEDIUM
        println("$location ceiling fan is on medium")
    }

    fun low() {
        speed = LOW
        println("$location ceiling fan is on low")
    }

    fun off() {
        speed = OFF
        println("$location ceiling fan is off")
    }

    enum class Speed {
        HIGH,
        MEDIUM,
        LOW,
        OFF
    }
}
