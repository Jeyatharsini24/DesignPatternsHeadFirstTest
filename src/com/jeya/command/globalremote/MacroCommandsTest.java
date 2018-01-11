package com.jeya.command.globalremote;

import com.jeya.command.globalremote.commandreceivers.Hottub;
import com.jeya.command.globalremote.commandreceivers.Light;
import com.jeya.command.globalremote.commandreceivers.Stereo;
import com.jeya.command.globalremote.commandreceivers.TV;
import com.jeya.command.globalremote.commands.Command;
import com.jeya.command.globalremote.commands.HottubOffCommand;
import com.jeya.command.globalremote.commands.HottubOnCommand;
import com.jeya.command.globalremote.commands.LightOffCommand;
import com.jeya.command.globalremote.commands.LightOnCommand;
import com.jeya.command.globalremote.commands.MacroCommand;
import com.jeya.command.globalremote.commands.StereoOffForCDCommand;
import com.jeya.command.globalremote.commands.StereoOnForCDCommand;
import com.jeya.command.globalremote.commands.TVOffCommand;
import com.jeya.command.globalremote.commands.TVOnCommand;
import com.jeya.command.globalremote.invoker.RemoteControl;

public class MacroCommandsTest
{
  public static void main(String[] args)
  {
    Light light = new Light("Living room");
    TV tv = new TV("Living room");
    Stereo stereo = new Stereo("Living room");
    Hottub hottub = new Hottub("Living room");

    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnForCDCommand stereoOn = new StereoOnForCDCommand(stereo);
    TVOnCommand tvOn = new TVOnCommand(tv);
    HottubOnCommand hottubOn = new HottubOnCommand(hottub);
    
    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOffForCDCommand stereoOff = new StereoOffForCDCommand(stereo);
    TVOffCommand tvOff = new TVOffCommand(tv);
    HottubOffCommand hottubOff = new HottubOffCommand(hottub);
    
    Command[]partyOnCommands = {lightOn, stereoOn, tvOn, hottubOn};
    Command[]partyOffCommands = {lightOff, stereoOff, tvOff, hottubOff};
    
    MacroCommand partyOnMacro = new MacroCommand(partyOnCommands);
    MacroCommand partyOffMacro = new MacroCommand(partyOffCommands);
    
    RemoteControl remoteControl = new RemoteControl();
    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
    System.out.println(remoteControl);
    System.out.println("----------------Pushing Macro On------------------");
    remoteControl.onButtonWasPushed(0);
    System.out.println("----------------Pushing Macro Off------------------");
    remoteControl.offButtonWasPushed(0);
  }
}