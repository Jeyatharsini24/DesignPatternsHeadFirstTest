package com.jeya.facade;

import com.jeya.facade.hometheater.HomeTheaterFacade;
import com.jeya.facade.hometheater.devices.Amplifier;
import com.jeya.facade.hometheater.devices.CdPlayer;
import com.jeya.facade.hometheater.devices.DvdPlayer;
import com.jeya.facade.hometheater.devices.PopcornPopper;
import com.jeya.facade.hometheater.devices.Projector;
import com.jeya.facade.hometheater.devices.Screen;
import com.jeya.facade.hometheater.devices.TheaterLights;
import com.jeya.facade.hometheater.devices.Tuner;

public class HomeTheaterTest
{
  public static void main(String[] args)
  {
    Amplifier amplifier = new Amplifier();
    Tuner tuner = new Tuner();
    DvdPlayer dvdPlayer = new DvdPlayer();
    CdPlayer cdPlayer = new CdPlayer();
    Projector projector = new Projector();
    TheaterLights lights = new TheaterLights();
    Screen screen = new Screen();
    PopcornPopper popper = new PopcornPopper();
    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector,
        lights, screen, popper);
    homeTheaterFacade.watchMovie("Oh My God");
    homeTheaterFacade.endMovie();
  }
}