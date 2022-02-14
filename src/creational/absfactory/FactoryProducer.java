package creational.absfactory;

public class FactoryProducer {

  public static AbstractFactory getFactory(boolean myBias) {
    if (myBias) { //see wrc 1996, 1997, 1998, 1999
      return new MitsubishiFactory();
    } else {
      return new SubaruFactory();
    }
  }
}
