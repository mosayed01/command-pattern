package undo.simplelight


class SimpleLight(private val location: String) {

    fun on() {
        println("$location Light is on")
    }

    fun off() {
        println("$location Light is off")
    }
}

