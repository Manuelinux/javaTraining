public class Vehicle {

  /** The current load of the vehicle in kilograms. */
  private double load;
  /** The maximum load of the vehicle in kilograms. */
  private double maxLoad;

  /**
   * This is the basic constructor for all Vehicles.
   *
   * @param max_load   the maximum load of this vehicle in kilograms
   */
  public Vehicle(double max_load) {
    load = 0.0;
    maxLoad = max_load;
  }

  /** This method returns the current load in kilograms. */
  public double getLoad() {
    return load;
  }
  /** This method returns the maximum load in kilograms. */
  public double getMaxLoad() {
    return maxLoad;
  }

  /**
   * This adds a box to the vehicle.
   *
   * @param weight  the weight of the box in kilograms
   */
  public boolean addBox(double weight) {
    boolean result = true;

    if ( maxLoad < (weight + load) ) {
      result = false;
    } else {
      load = load + weight;
    }

    return result;
  }
}
