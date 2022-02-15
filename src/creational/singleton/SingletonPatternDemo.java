package creational.singleton;

public class SingletonPatternDemo {

  public static void main(String[] args) {

    //ReusedEngine build = new ReusedEngine();

    ReusedEngine ls = ReusedEngine.getInstance();
    ls.showHistory();
  }
}
