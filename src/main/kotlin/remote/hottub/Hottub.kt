package remote.hottub


class Hottub {
    var on = false
        private set

    var temperature = 0
        private set

    fun on() {
        on = true
    }

    fun off() {
        on = false
    }

    fun bubblesOn() {
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

    fun setTemperature(temperature: Int) {
        this.temperature = temperature
    }

    fun heat() {
        temperature = 105
        println("Hottub is heating to a steaming 105 degrees")
    }

    fun cool() {
        temperature = 98
        println("Hottub is cooling to 98 degrees")
    }
}
