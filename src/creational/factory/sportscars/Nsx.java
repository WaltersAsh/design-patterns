package creational.factory.sportscars;

import creational.factory.SportsCar;

public class Nsx implements SportsCar {

  @Override
  public void popHood() {
    System.out.println("Honda NSX: 3.2 litre naturally aspirated piston V6 C32B engine");
  }
}
