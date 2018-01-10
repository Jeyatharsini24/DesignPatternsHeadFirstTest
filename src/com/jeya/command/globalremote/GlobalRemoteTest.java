package com.jeya.command.globalremote;

import com.jeya.command.globalremote.commandreceivers.CeilingFan;
import com.jeya.command.globalremote.commandreceivers.GarageDoor;
import com.jeya.command.globalremote.commandreceivers.Light;
import com.jeya.command.globalremote.commandreceivers.Stereo;
import com.jeya.command.globalremote.commands.CeilingFanHighCommand;
import com.jeya.command.globalremote.commands.CeilingFanLowCommand;
import com.jeya.command.globalremote.commands.CeilingFanMediumCommand;
import com.jeya.command.globalremote.commands.CeilingFanOffCommand;
import com.jeya.command.globalremote.commands.GarageDoorCloseCommand;
import com.jeya.command.globalremote.commands.GarageDoorOpenCommand;
import com.jeya.command.globalremote.commands.LightOffCommand;
import com.jeya.command.globalremote.commands.LightOnCommand;
import com.jeya.command.globalremote.commands.StereoOffForCDCommand;
import com.jeya.command.globalremote.commands.StereoOnForCDCommand;
import com.jeya.command.globalremote.invoker.RemoteControl;

public class GlobalRemoteTest
{
  public static void main(String[] args)
  {
    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light("Living room");
    Light kitchenLight = new Light("Kitchen");
    CeilingFan ceilingFan = new CeilingFan("Living room");
    GarageDoor garageDoor = new GarageDoor("Guest house");
    Stereo streo = new Stereo("Living room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

    CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
    CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
    CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
    CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);

    GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

    StereoOnForCDCommand stereoOnForCDCommand = new StereoOnForCDCommand(streo);
    StereoOffForCDCommand stereoOffForCDCommand = new StereoOffForCDCommand(streo);

    remoteControl.setCommand(4, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(3, kitchenLightOn, kitchenLightOff);
    remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
    remoteControl.setCommand(1, stereoOnForCDCommand, stereoOffForCDCommand);
    remoteControl.setCommand(0, ceilingFanLowCommand, ceilingFanOffCommand);
    remoteControl.setCommand(5, ceilingFanHighCommand, ceilingFanOffCommand);
    remoteControl.setCommand(6, ceilingFanMediumCommand, ceilingFanOffCommand);
    
    System.out.println(remoteControl);
    remoteControl.onButtonWasPushed(4);
    remoteControl.offButtonWasPushed(4);
    remoteControl.undoButtonWasPushed();
    remoteControl.onButtonWasPushed(3);
    remoteControl.offButtonWasPushed(3);
    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    System.out.println("--------------------------------------------------------");
    System.out.println("Ceiling fan: ");
    remoteControl.onButtonWasPushed(6);
    remoteControl.offButtonWasPushed(6);
    remoteControl.undoButtonWasPushed();
    remoteControl.onButtonWasPushed(5);
    remoteControl.undoButtonWasPushed();
    System.out.println("--------------------------------------------------------");
  }
}