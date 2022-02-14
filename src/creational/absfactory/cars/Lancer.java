package creational.absfactory.cars;

import creational.absfactory.Car;

public class Lancer implements Car {

  @Override
  public void popHood() {
    System.out.println("Mitsubishi Lancer: 1.8 litre naturally aspirated inline 4 18GTI engine");
  }
}
