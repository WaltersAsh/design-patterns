package creational.factory.sportscars;

import creational.factory.SportsCar;

public class Rx7 implements SportsCar {

  @Override
  public void popHood() {
    System.out.println("Mazda RX7: 1.3 litre twin turbo charged rotary 2 rotor 13B-REW engine");
  }
}
