package creational.factory;

public class FactoryPatternDemo {

  public static void main(String[] args) {
    SportsCarFactory fact = new SportsCarFactory();

    SportsCar mazda = fact.getSportsCar("RX7");
    SportsCar nissan = fact.getSportsCar("GTR");
    SportsCar honda = fact.getSportsCar("NSX");

    mazda.popHood();
    nissan.popHood();
    honda.popHood();
  }
}
