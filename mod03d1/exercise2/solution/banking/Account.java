package banking;

public class Account {

  private double   balance;

  public Account(double bal) {
    balance = bal;
  }

  public double getBalance() {
    return balance;
  }
  public void deposit(double amount) {
    balance = balance + amount;
  }
  public void withdraw(double amount) {
    balance = balance - amount;
  }
}
