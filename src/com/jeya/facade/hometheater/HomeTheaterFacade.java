package com.jeya.facade.hometheater;

import com.jeya.facade.hometheater.devices.Amplifier;
import com.jeya.facade.hometheater.devices.CdPlayer;
import com.jeya.facade.hometheater.devices.Dvd;
import com.jeya.facade.hometheater.devices.DvdPlayer;
import com.jeya.facade.hometheater.devices.PopcornPopper;
import com.jeya.facade.hometheater.devices.Projector;
import com.jeya.facade.hometheater.devices.Screen;
import com.jeya.facade.hometheater.devices.TheaterLights;
import com.jeya.facade.hometheater.devices.Tuner;

public class HomeTheaterFacade
{
  private Amplifier amplifier;

  private Tuner tuner;

  private DvdPlayer dvdPlayer;

  private CdPlayer cdPlayer;

  private Projector projector;

  private TheaterLights lights;

  private Screen screen;

  private PopcornPopper popper;

  public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer,
                           Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper)
  {
    super();
    this.amplifier = amplifier;
    this.tuner = tuner;
    this.dvdPlayer = dvdPlayer;
    this.cdPlayer = cdPlayer;
    this.projector = projector;
    this.lights = lights;
    this.screen = screen;
    this.popper = popper;
  }
  
  public void watchMovie(String movie)
  {
    System.out.println("Get ready to watch a movie...");
    popper.on();
    popper.pop();
    lights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amplifier.on();
    amplifier.setDvd(getDvd(movie));
    amplifier.setSurroundSound();
    amplifier.setVolume(5);
    dvdPlayer.on();
  }
  
  public void endMovie()
  {
    System.out.println("Shutting movie theater down...");
    popper.off();
    lights.on();
    screen.up();
    projector.off();
    amplifier.off();
    dvdPlayer.stop();
    dvdPlayer.eject();
    dvdPlayer.off();
  }
  
  private Dvd getDvd(String movie)
  {
    return new Dvd(movie);
  }
}