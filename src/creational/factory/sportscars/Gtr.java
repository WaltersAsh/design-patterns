package creational.factory.sportscars;

import creational.factory.SportsCar;

public class Gtr implements SportsCar {

  @Override
  public void popHood() {
    System.out.println("Nissan Skyline GTR: 2.6 litre twin turbo charged piston inline 6 RB26DETT engine");
  }
}
