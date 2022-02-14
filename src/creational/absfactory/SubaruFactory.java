package creational.absfactory;

import creational.absfactory.cars.CarModels;
import creational.absfactory.cars.Impreza;
import creational.absfactory.cars.ImprezaWrx;

public class SubaruFactory extends AbstractFactory {

  @Override
  public Car getCar(CarModels model) {
    if (CarModels.Impreza.equals(model)) {
      return new Impreza();
    } else if (CarModels.Wrx.equals(model)) {
      return new ImprezaWrx();
    } else {
      return null;
    }
  }

   /* Switch statements do not work properly in this context, use Strings instead

     switch (model) {
      case Impreza:
        return new Impreza();
      case Wrx:
        return new ImprezaWrx();
      default:
        return null;
    }
     */
}
