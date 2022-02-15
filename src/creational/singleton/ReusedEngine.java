package creational.singleton;

public class ReusedEngine {

  private static ReusedEngine instance = new ReusedEngine();

  private ReusedEngine() {}

  public static ReusedEngine getInstance() {
    return instance;
  }

  public void showHistory() {
    System.out.println("This 500 horsepower V8 naturally aspirated engine LS7 has " +
                        "been transplanted in four different cars:\n" +
                        "1. 2006 Chevrolet Corvette C6\n" +
                        "2. 2014 Lamborghini Huracan LP 610-4 Coupe\n" +
                        "3. 1986 Toyota AE86 Sprinter Trueno\n" +
                        "4. 2004 Mazda RX-8"
                     );

  }
}
