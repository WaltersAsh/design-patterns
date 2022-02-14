package creational.absfactory;

import creational.absfactory.cars.CarModels;

public abstract class AbstractFactory {

  abstract Car getCar(CarModels model);
}
