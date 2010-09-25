public class Assign {
  public static void main (String args []) {
    int x, y;                // declare integer variables
    float z = 3.414f;        // declare and assign floating point
    double w = 3.1415;       // declare and assign double
    boolean truth = true;    // declare and assign boolean 
    char c;                  // declare character variable
    String str;              // declare String variable
    String str1 = "bye";     // declare and assign String variable
    c = 'A';                 // assign value to char variable
    str = "Hi out there!";   // assign value to String variable
    x = 6;                   // assign values to int variables
    y = 1000;    


    // Things that won't work...

    y = 3.1415926;      // value is not an int;
                        // it would require casting and
                        // the decimal would be truncated

    w = 175,000;        // commas can't be used

    truth = 1;          // C / C+ programmers beware

    z = 3.1415926/     // Can't put a double into a float;
                       // This would require a cast

  }  
}
