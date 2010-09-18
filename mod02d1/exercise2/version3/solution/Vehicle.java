public class Vehicle {

  /** The conversion factor for kilograms to newtons. */
  private static double KG_TO_NEWTON = 9.8;

  /** The current load of the vehicle in newtons. */
  private double load;
  /** The maximum load of the vehicle in newtons. */
  private double maxLoad;

  /**
   * This is the basic constructor for all Vehicles.
   *
   * @param max_load   the maximum load of this vehicle in kilograms
   */
  public Vehicle(double max_load) {
    load = 0.0;
    maxLoad = kiloToNewts(max_load);
  }

  /** This method returns the current load in kilograms. */
  public double getLoad() {
    return newtsToKilo(load);
  }
  /** This method returns the maximum load in kilograms. */
  public double getMaxLoad() {
    return newtsToKilo(maxLoad);
  }

  /**
   * This adds a box to the vehicle.
   *
   * @param weight  the weight of the box in kilograms
   */
  public boolean addBox(double weight) {
    double weight_in_newtons = kiloToNewts(weight);
    boolean result = true;

    if ( maxLoad < (weight_in_newtons + load) ) {
      result = false;
    } else {
      load = load + weight_in_newtons;
    }

    return result;
  }

  private double kiloToNewts(double weight) {
    return (weight * KG_TO_NEWTON);
  }
  private double newtsToKilo(double weight) {
    return (weight / KG_TO_NEWTON);
  }
}
