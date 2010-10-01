public class TestContinue {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;

    test:
    for (; x <= 2; x++ ) {
        System.out.println("top of outer do x = " + x);
        y = x;
        while ( y <= 2 ) {
            System.out.println("   top of inner do y = " + y);
            if ( y == 1 ) continue test;
            System.out.println("   bottom of inner do y = " + y);
            y++;
        }
        System.out.println("bottom of outer do x = " + x);
    };


/*
    test:
    do {
        System.out.println("top of outer do x = " + x);
            do {
              System.out.println("   top of inner do x = " + x);
              if ( x == 1 ) continue test;
              System.out.println("   bottom of inner do x = " + x);
            } while ( true );
        System.out.println("bottom of outer do x = " + x);
    } while ( x <= 2 );
*/


  }

}
