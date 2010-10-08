public class Blatz2 {
  public Blatz2(String s) { }
  public Blatz2(Thread t) {}

  public static void main(String[] args) {
    Blatz2 b1 = new Blatz2(null);
    Blatz2 b2 = new Blatz2((String)null);
    Blatz2 b3 = new Blatz2((Thread)null);

  }
}
