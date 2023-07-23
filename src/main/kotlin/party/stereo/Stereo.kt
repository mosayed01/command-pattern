package party.stereo


class Stereo(private val location: String) {
    fun on() {
        println("$location stereo is on")
    }

    fun off() {
        println("$location stereo is off")
    }

    fun setCD() {
        println("$location stereo is set for CD input")
    }

    fun setDVD() {
        println("$location stereo is set for DVD input")
    }

    fun setRadio() {
        println("$location stereo is set for Radio")
    }

    fun setVolume(volume: Int) {
        println("$location stereo volume set to $volume")
    }
}
