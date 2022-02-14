package creational.absfactory;

import creational.absfactory.cars.CarModels;
import creational.absfactory.cars.Lancer;
import creational.absfactory.cars.LancerEvo;

public class MitsubishiFactory extends AbstractFactory {

  @Override
  public Car getCar(CarModels model) {

    if (CarModels.Lancer.equals(model)) {
      return new Lancer();
    } else if (CarModels.Evo.equals(model)) {
      return new LancerEvo();
    } else {
      return null;
    }

    /* Switch statements do not work properly in this context, use Strings instead

    switch (model) {
      case Lancer:
        return new Lancer();
      case Evo:
        return new LancerEvo();
      default:
        return null;
    }
     */
  }
}
