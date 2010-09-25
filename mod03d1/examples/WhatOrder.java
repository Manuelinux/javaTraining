/* The question is, Must a variable be defined
   prior to its use?
*/

public class WhatOrder {
  public static void main(String[] args) {

    int x;                 // Move this two lines down
    x = 5;
    System.out.println(Math.sin(x));


    Thing thing1;         // Move this two lines down
    thing1 = new Thing();
    System.out.println("thing1.x is " + thing1.getX());
  }
}
