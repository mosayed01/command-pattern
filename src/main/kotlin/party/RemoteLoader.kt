package party

import party.hottub.Hottub
import party.hottub.HottubOffCommand
import party.hottub.HottubOnCommand
import party.light.Light
import party.light.LightOffCommand
import party.light.LightOnCommand
import party.stereo.Stereo
import party.stereo.StereoOffCommand
import party.stereo.StereoOnCommand
import party.tv.TV
import party.tv.TVOffCommand
import party.tv.TVOnCommand

fun main() {
    val remoteControl = RemoteControl()

    val light = Light("Living Room")
    val tv = TV("Living Room")
    val stereo = Stereo("Living Room")
    val hottub = Hottub()

    val lightOn = LightOnCommand(light)
    val stereoOn = StereoOnCommand(stereo)
    val tvOn = TVOnCommand(tv)
    val hottubOn = HottubOnCommand(hottub)
    val lightOff = LightOffCommand(light)
    val stereoOff = StereoOffCommand(stereo)
    val tvOff = TVOffCommand(tv)
    val hottubOff = HottubOffCommand(hottub)

    val partyOn = listOf(lightOn, stereoOn, tvOn, hottubOn)
    val partyOff = listOf(lightOff, stereoOff, tvOff, hottubOff)

    val partyOnMacro = MacroCommand(partyOn)
    val partyOffMacro = MacroCommand(partyOff)

    remoteControl.setCommand(0, partyOnMacro, partyOffMacro)

    println(remoteControl)

    println("--- Pushing Macro On---")
    remoteControl.onButtonWasPushed(0)

    println("\n--- Pushing Macro Off---")
    remoteControl.offButtonWasPushed(0)
}