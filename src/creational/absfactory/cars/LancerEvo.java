package creational.absfactory.cars;

import creational.absfactory.Car;

public class LancerEvo implements Car {

  @Override
  public void popHood() {
    System.out.println("Mitsubishi Lancer Evolution: 2.0 litre turbo charged inline 4 4G63T engine");
  }
}
