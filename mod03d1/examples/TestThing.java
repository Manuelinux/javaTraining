public class TestThing {
  public static void main(String[] args) {
    Thing  thing1 = new Thing();
    Thing  thing2 = new Thing(42);

    System.out.println("thing1.x is " + thing1.getX());
    System.out.println("thing2.x is " + thing2.getX());
  }
}
