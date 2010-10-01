class ScopeThingie {
  private int i=1;

  public void firstMethod() {
    int i=4, j=5;
    this.i = i + j;
    secondMethod(7);
  }

  public void secondMethod(int i) {
    int j = 8;
    this.i = i + j;
  }

  public int getValue() {
    return i;
  }

}



public class ScopeExample {
  public static void main(String[] args) {
    ScopeThingie  scope = new ScopeThingie();
    System.out.println("Original i = " + scope.getValue() );
    scope.firstMethod();
    System.out.println("New      i = " + scope.getValue() );
  }
}
