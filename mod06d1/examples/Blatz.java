public class Blatz {
  public static void myMethod(A a) { System.out.println("A"); }
  public static int myMethod(B b) { System.out.println("B"); return 0; }

  public static void main(String aregs[]) {
    A a = new A();
    B b = new B();

    myMethod(a);
    myMethod(b);
  }
}

class A { A() {} }
class B extends A { B() {} }
