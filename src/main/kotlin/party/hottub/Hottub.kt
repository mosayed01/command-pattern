package party.hottub

class Hottub {
    var on = false
        private set

    var temperature = 0
        set(value) {
            println("Hottub is ${if (value > temperature) "heating to a steaming" else "cooling to"} $value degrees")
            field = value
        }

    fun on() {
        on = true
    }

    fun off() {
        on = false
    }

    fun circulate() {
        if (on) {
            println("Hottub is bubbling!")
        }
    }

    fun bubblesOff() {
        if (on) {
            println("Hottub is not bubbling")
        }
    }

    fun jetsOn() {
        if (on) {
            println("Hottub jets are on")
        }
    }

    fun jetsOff() {
        if (on) {
            println("Hottub jets are off")
        }
    }
}
