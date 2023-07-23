package party.tv

class TV(private val location: String) {
    private var channel = 0

    fun on() {
        println("$location TV is on")
    }

    fun off() {
        println("$location TV is off")
    }

    fun setInputChannel() {
        channel = 3
        println("$location TV channel is set for DVD")
    }
}
