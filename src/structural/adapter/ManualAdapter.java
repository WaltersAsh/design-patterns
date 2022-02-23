package structural.adapter;

public class ManualAdapter implements AutomaticCar {

  ManualCar manCar;

  public ManualAdapter(ManualCar manCar) {
    this.manCar = manCar;
  }

  @Override
  public void accelerate() {
    this.manCar.accelerate();
  }

  @Override
  public void brake() {
    this.manCar.brake();
  }

  @Override
  public void compShiftUp() {
    this.manCar.shiftUp();
  }

  @Override
  public void compShiftDown() {
    this.manCar.shiftDown();
  }
}
