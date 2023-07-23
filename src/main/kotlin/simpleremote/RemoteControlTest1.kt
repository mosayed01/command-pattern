package simpleremote

fun main() {
    val remote = SimpleRemoteControl()
    val light = Light()
    val lightOn = LightOnCommand(light)

    remote.setCommand(lightOn)
    remote.buttonWasPressed()
}