/* The first use of 'this'...

   First of all, 'this' is only used in methods.
   It has three usages. The first is illustrated here.

   The class has a field called 'r'. The method setRadius()
   has a local variable called 'r'. To tell the difference,
   use 'this' to create an automatic reference to the calling
   object, hence 'this.r' means the 'r' field of the calling
   object. The plain 'r' in the setRadius() method is simply
   the local variable 'r'. */


public class Circle {

   private double r;       // <-- note r is not assigned a value

   public void setRadius(double r){
      this.r = r;          // <-- note first use of 'this'
   }

   public double getRadius() {
      return r;
   }

   public static void main(String[] args) {

      System.out.println("\nMaking a Circle...notice the radius value...");

      Circle firstCircle = new Circle();
      System.out.println("Default radius = " + firstCircle.getRadius());

	  firstCircle.setRadius(5.0);
      System.out.println("New radius is  = " + firstCircle.getRadius());

   }

}

