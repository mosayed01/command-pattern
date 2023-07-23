package remote.garagedoor

import remote.Command


class GarageDoorDownCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.down()
    }
}
