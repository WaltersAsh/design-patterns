package creational.absfactory;

import creational.absfactory.cars.CarModels;

public class AbstractFactoryPatternDemo {

  public static void main(String[] args) {
  AbstractFactory subaruFactory = FactoryProducer.getFactory(false);
  Car impreza = subaruFactory.getCar(CarModels.Impreza);
  Car wrx = subaruFactory.getCar(CarModels.Wrx);
  impreza.popHood();
  wrx.popHood();

  System.out.println(" ");

  AbstractFactory mitsubishiFactory = FactoryProducer.getFactory(true);
  Car lancer = mitsubishiFactory.getCar(CarModels.Lancer);
  Car evo = mitsubishiFactory.getCar(CarModels.Evo);
  lancer.popHood();
  evo.popHood();
  }
}
