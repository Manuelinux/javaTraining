public class PassTest {

                        // 3 Methods to change the current values
  public static void changeInt(int value) {
    value = 55;
  }

  public static void changeObjectRef(MyDate ref) {
    ref = new MyDate(1, 1, 2000);
  }

  public static void changeObjectAttr(MyDate ref) {
    ref.setDay(4);
  }


  public static void main(String args[]) {
    MyDate date;
    int val;

    val = 11;                 // Assign 'int' and print value
    System.out.println("Original int value is: " + val);
    changeInt(val);           // Try to change it
                              // What's the new value?
    System.out.println("New int value is:      " + val +'\n');


    date = new MyDate(22, 7, 1964);  // Assign the date and print value
    System.out.println("Original object value is:");
    date.print();
    changeObjectRef(date);           // Try to change it and then print
    System.out.println("New object value is:");
    date.print();


                                   // Change 'day' attribute
                                   // through object reference
    changeObjectAttr(date);
    System.out.println('\n' + "Using object reference, value is now:");
    date.print();                  // What's the new value?

  }

}
