
// This file tests some variations of labelled break/continue statements.

public class StmtLabels {
  public static void main(String[] args) {
    int count = 0;

    
  lab1:                               // test break label on compound statement
    {
      System.out.println("before lab1");
      if ( count == 0 ) 
        { break lab1; }
      System.out.println("after lab1");
    }


  System.out.println("before lab1a");       // test break label on if statement
  lab1a:
    if ( count == 0 ) {
      break lab1a;
    } else {
      System.out.println("else clause; not break to lab1a");
    }
  System.out.println("after lab1a");


  lab2:                            // test continue label on compound statement
    {
      System.out.println("before lab2");
      //if ( count == 0 ) {
      //  continue lab2;          // can't use 'continue' in an 'if' block
      //}
      System.out.println("after lab2");
    }


  }
}
