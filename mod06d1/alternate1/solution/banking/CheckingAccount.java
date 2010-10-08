package banking;

public class CheckingAccount extends Account {

  private SavingsAccount protectedBy;

  public CheckingAccount(double bal, SavingsAccount prot) {
    super(bal);
    protectedBy = prot;
  }
  public CheckingAccount(double bal) {
    this(bal, null);
  }

  public boolean withdraw(double amount) {
    double amountNeeded = balance - amount;
    boolean result = true;

    if ( balance < amount ) {
      if (   (protectedBy == null)
	  || ! protectedBy.withdraw(-amountNeeded) ) {
	result = false;
      } else {
	balance = 0.0;
      }
    } else {
      balance = balance - amount;
    }

    return result;
  }
}
