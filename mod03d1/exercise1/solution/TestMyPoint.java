public class TestMyPoint {
  public static void main(String[] args) {

    // Step 1: declare variables
    MyPoint start = new MyPoint();
    MyPoint end = new MyPoint();

    // Step 2: assign data attributes of start and end
    start.x = 10;
    start.y = 10;
    end.x = 20;
    end.y = 30;

    // Step 3: print out start and end
    System.out.println("Start point is " + start);
    System.out.println("End point is " + end);
    System.out.println();

    // Step 5: declare and assign stray to end
    MyPoint stray = end;

    // Step 6: declare and assign stray to end
    System.out.println("Stray point is " + stray);
    System.out.println("End point is " + end);
    System.out.println();

    // Step 7: assign new values to stray
    stray.x = 47;
    System.out.println("Stray point is " + stray);
    System.out.println("End point is " + end);
    System.out.println("Start point is " + start);
  }
}

    
