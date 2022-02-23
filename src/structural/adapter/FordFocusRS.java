package structural.adapter;

public class FordFocusRS implements ManualCar {
  @Override
  public void accelerate() {
    System.out.println("Stepping on the accelerator");
  }

  @Override
  public void brake() {
    System.out.println("Stepping on the brake pedal");
  }

  @Override
  public void shiftUp() {
    System.out.println("Moving shifter up a gear");
  }

  @Override
  public void shiftDown() {
    System.out.println("Moving shifter down a gear");
  }

}
