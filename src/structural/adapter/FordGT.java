package structural.adapter;

public class FordGT implements AutomaticCar{


  @Override
  public void accelerate() {
    System.out.println("Stepping on the accelerator");
  }

  @Override
  public void brake() {
    System.out.println("Stepping on the brake pedal");
  }

  @Override
  public void compShiftUp() {
    System.out.println("Dual clutch module automatically shifts up");
  }

  @Override
  public void compShiftDown() {
    System.out.println("Dual clutch module automatically shifts down");
  }
}
