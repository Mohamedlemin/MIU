package FPP.Lesson3.Lab3.assigment_2.employeInfo;

import FPP.Lesson3.Lab3.assigment_1.AccountType;

class Account2 {
	private final Employee2 employee;
	//Q1
	public AccountType accountType;
	private final static double DEFAULT_BALANCE = 0.0;
	//Q3
	public double balance;


	Account2(Employee2 emp, AccountType acctType, double balance) {
		employee = emp;
		this.accountType = acctType;
		this.balance = balance;
	}

	Account2(Employee2 emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type = " + accountType +"\nCurrent balance : " + balance +"\n";

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
