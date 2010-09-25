/* The second use of 'this'...

   When used in the increment() method, 'this'
   provides an automatic reference to the calling object.
   This reference is returned by the increment() method.
   
   We will see the third usage of 'this' when we look at
   the use of constructors. */


public class HooGee {

   int i = 0;

   public HooGee increment(){
      i = i + 1;
      return this;          // <-- note second use of 'this'
   }

   public void print() {
      System.out.println("i = " + i);
   }

   public static void main(String[] args) {

      System.out.println("\nMaking first HooGee...");
      HooGee myHooGee = new HooGee();
      myHooGee.print();
      myHooGee.increment();
      myHooGee.print();

      System.out.println("\nMaking second HooGee...");
	  HooGee anotherHooGee = new HooGee();
	  anotherHooGee.print();
	  anotherHooGee.increment().increment().increment().print();
   }

}

