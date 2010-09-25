public class Thing {
  private int x;

  public Thing() {        // constructors
    x = 47;
  }
  public Thing(int new_x) {
    x = new_x;
  }

  public int getX() {     // methods
    return x;
  }
  public void setX(int new_x) {
    x = new_x;
  }
}
