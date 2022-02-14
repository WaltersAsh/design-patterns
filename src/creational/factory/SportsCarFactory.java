package creational.factory;

import creational.factory.sportscars.Gtr;
import creational.factory.sportscars.Nsx;
import creational.factory.sportscars.Rx7;

public class SportsCarFactory {

  public SportsCar getSportsCar(String sportsCarType) {
    switch (sportsCarType.toUpperCase()) {
      case "RX7":
        return new Rx7();
      case "NSX":
        return new Nsx();
      case "GTR":
        return new Gtr();
      default:
        return null;
    }
  }
}
