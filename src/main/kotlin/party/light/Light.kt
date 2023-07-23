package party.light

class Light(private val location: String) {
    var level = 0
        private set

    fun on() {
        level = 100
        println("$location Light is on")
    }

    fun off() {
        level = 0
        println("$location Light is off")
    }

    fun dim(level: Int) {
        this.level = level
        if (level == 0) {
            off()
        } else {
            println("$location Light is dimmed to $level%")
        }
    }
}

