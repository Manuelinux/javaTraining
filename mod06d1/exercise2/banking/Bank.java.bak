package banking;

public class Bank {
  private static int MAX_CUSTOMERS = 10;

  private Customer[] customers;
  private int        numberOfCustomers;

  public Bank() {
    customers = new Customer[MAX_CUSTOMERS];
    numberOfCustomers = 0;
  }

  public void addCustomer(String f, String l) {
    int i = numberOfCustomers++;
    customers[i] = new Customer(f, l);
  }
  public Customer getCustomer(int customer_index) {
    return customers[customer_index];
  }
  public int getNumOfCustomers() {
    return numberOfCustomers;
  }
}

