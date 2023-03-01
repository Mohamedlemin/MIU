package FPP.Lesson3.Lab3.assigment_1;

class Account {
	//Q1
	public AccountType accountType;
	private final static double DEFAULT_BALANCE = 0.0;
	//Q3
	public double balance;

	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.accountType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + accountType + ", balance = " + balance;

	}
    // Q2
	public void makeDeposit(double deposit) {
		balance +=deposit;
	}
	// Q2
	public boolean makeWithdrawal(double amount) {
		if (balance>amount) {
			balance-=amount;
			return true;
		}
		return false;
	}
}
