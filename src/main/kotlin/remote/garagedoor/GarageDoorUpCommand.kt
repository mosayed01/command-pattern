package remote.garagedoor

import remote.Command


class GarageDoorUpCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }
}

