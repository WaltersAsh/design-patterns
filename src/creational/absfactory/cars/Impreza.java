package creational.absfactory.cars;

import creational.absfactory.Car;

public class Impreza implements Car {

  @Override
  public void popHood() {
    System.out.println("Subaru Impreza: 1.5 litre naturally aspirated boxer EJ15 engine");
  }
}
