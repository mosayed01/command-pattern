package remote

import remote.ceilingfan.CeilingFan
import remote.ceilingfan.CeilingFanOffCommand
import remote.ceilingfan.CeilingFanOnCommand
import remote.garagedoor.GarageDoor
import remote.garagedoor.GarageDoorDownCommand
import remote.garagedoor.GarageDoorUpCommand
import remote.light.Light
import remote.light.LightOffCommand
import remote.light.LightOnCommand
import remote.stereo.Stereo
import remote.stereo.StereoOffCommand
import remote.stereo.StereoOnWithCDCommand

fun main() {
    val remoteControl = RemoteControl()
    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("Kitchen")
    val ceilingFan = CeilingFan("Living Room")
    val garageDoor = GarageDoor("Garage")
    val stereo = Stereo("Living Room")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)
    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)
    val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
    val ceilingFanOff = CeilingFanOffCommand(ceilingFan)
    val garageDoorUp = GarageDoorUpCommand(garageDoor)
    val garageDoorDown = GarageDoorDownCommand(garageDoor)
    val stereoOnWithCD = StereoOnWithCDCommand(stereo)
    val stereoOff = StereoOffCommand(stereo)

    remoteControl.setCommand(LIVING_ROOM_LIGHT_SLOT, livingRoomLightOn, livingRoomLightOff)
    remoteControl.setCommand(KITCHEN_LIGHT_SLOT, kitchenLightOn, kitchenLightOff)
    remoteControl.setCommand(CEILING_FAN_SLOT, ceilingFanOn, ceilingFanOff)
    remoteControl.setCommand(STEREO_SLOT, stereoOnWithCD, stereoOff)
    remoteControl.setCommand(GARAGE_DOOR_SLOT, garageDoorUp, garageDoorDown)

    println(remoteControl)

    remoteControl.onButtonWasPushed(LIVING_ROOM_LIGHT_SLOT)
    remoteControl.offButtonWasPushed(LIVING_ROOM_LIGHT_SLOT)
    remoteControl.onButtonWasPushed(KITCHEN_LIGHT_SLOT)
    remoteControl.offButtonWasPushed(KITCHEN_LIGHT_SLOT)
    remoteControl.onButtonWasPushed(CEILING_FAN_SLOT)
    remoteControl.offButtonWasPushed(CEILING_FAN_SLOT)
    remoteControl.onButtonWasPushed(STEREO_SLOT)
    remoteControl.offButtonWasPushed(STEREO_SLOT)
    remoteControl.offButtonWasPushed(GARAGE_DOOR_SLOT)
    remoteControl.offButtonWasPushed(GARAGE_DOOR_SLOT)
}

private const val LIVING_ROOM_LIGHT_SLOT = 0
private const val KITCHEN_LIGHT_SLOT = 1
private const val CEILING_FAN_SLOT = 2
private const val STEREO_SLOT = 3
private const val GARAGE_DOOR_SLOT = 4

