package banking;

public class Customer {
  // Data Attributes
  private String   firstName;
  private String   lastName;
  // Association Attributes
  private SavingsAccount  savingsAccount;
  private CheckingAccount  checkingAccount;

  public Customer(String f, String l) {
    firstName = f;
    lastName = l;
  }

  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public SavingsAccount getSavings() {
    return savingsAccount;
  }
  public void setSavings(SavingsAccount acct) {
    savingsAccount = acct;
  }
  public CheckingAccount getChecking() {
    return checkingAccount;
  }
  public void setChecking(CheckingAccount acct) {
    checkingAccount = acct;
  }
}
