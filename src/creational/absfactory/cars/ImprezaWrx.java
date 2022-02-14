package creational.absfactory.cars;

import creational.absfactory.Car;

public class ImprezaWrx implements Car {

  @Override
  public void popHood() {
    System.out.println("Subaru Impreza WRX STI: 2.0 litre turbo charged boxer EJ20T engine");
  }
}
