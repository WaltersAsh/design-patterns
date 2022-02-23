package structural.adapter;

public class AdapterPatternDemo {
  public static void main(String[] args) {
    FordGT gt = new FordGT();                               //is automatic
    ManualCar rs = new FordFocusRS();
    AutomaticCar manualAdapter = new ManualAdapter(rs);     //wrap a rs with a manualAdapter

    System.out.println("Automatic Ford GT");
    gt.accelerate();
    gt.compShiftUp();
    gt.brake();
    gt.compShiftDown();

    System.out.println("\nManual Ford Focus RS");
    rs.accelerate();
    rs.shiftUp();
    rs.brake();
    rs.shiftDown();

    System.out.println("\nManual adapter");
    manualAdapter.accelerate();
    manualAdapter.compShiftUp();
    manualAdapter.brake();
    manualAdapter.compShiftDown();         //automatic car behaves like a manual
  }
}
