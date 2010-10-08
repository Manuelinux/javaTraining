package banking;

public class SavingsAccount extends Account {

  private double   interestRate;

  public SavingsAccount(double bal, double rate) {
    super(bal);
    interestRate = rate;
  }
}
