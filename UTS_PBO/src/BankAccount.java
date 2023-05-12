public class BankAccount{
	private String accountNumber;
	private String accountName;
	private int balance;

	public BankAccount(String accountNumber, String accountName, int balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	public void getAccountName() {
    System.out.println("Your Account Name: " + this.accountName);
  }

	public void getAccountNumber() {
		System.out.println("Your Account Number: "+this.accountNumber);
	}

	public void getBalance() {
		System.out.println("Your current Balance is "+this.balance);;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			this.balance = this.balance + amount;
      //return true;
			System.out.println("Deposit: "+ amount);
		} else {
      //return false;
			System.out.println("Deposit failed");
		}
	}
	
	public void withdraw(int amount) {
		if (amount > this.balance) {
			// return false;
      System.out.println("Withdraw failed");
		} else {
			this.balance = this.balance - amount;
      System.out.println("Withdraw: "+amount);
			// return true;
		}
	}

  public void print_ending_balance(){
    System.out.println("Account Number: "+ this.accountNumber+" \nAccount Name: " +this.accountName+"\nEnding Total Balance: "+this.balance);
  }

  public static void main(String[] args) {
    BankAccount n = new  BankAccount("123456","Randy",0);
    n.getBalance();
    n.deposit(20000);
    n.withdraw(5000);
    n.print_ending_balance();

  }
}