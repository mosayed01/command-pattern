package remote

class RemoteControl(noCommand: NoCommand = NoCommand()) {
    private val onCommands: MutableList<Command> = MutableList(7) { noCommand }
    private val offCommands: MutableList<Command> = MutableList(7) { noCommand }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
    }

    override fun toString(): String {
        val stringBuff = StringBuffer()
        stringBuff.append("\n------ Remote Control -------\n")

        for (i in onCommands.indices) {
            stringBuff.append("[slot $i] ${onCommands[i].javaClass.name} \t ${offCommands[i].javaClass.name}\n")
        }
        return stringBuff.toString()
    }
}
