package banking;

public class Account {

  protected double   balance;

  public Account(double bal) {
    balance = bal;
  }

  public double getBalance() {
    return balance;
  }
  public boolean deposit(double amount) {
    balance = balance + amount;
    return true;
  }
  public boolean withdraw(double amount) {
    boolean result = true;
    if ( balance < amount ) {
      result = false;
    } else {
      balance = balance - amount;
    }
    return true;
  }
}
