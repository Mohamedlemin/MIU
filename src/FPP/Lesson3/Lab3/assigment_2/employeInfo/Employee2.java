package FPP.Lesson3.Lab3.assigment_2.employeInfo;


import FPP.Lesson3.Lab3.assigment_1.AccountType;
import FPP.Lesson3.Lab3.assigment_2.employeInfo.Account2;

import java.time.LocalDate;

public class Employee2 {

    private Account2 retirementAcct;
    private Account2 savingsAcct;
    private Account2 checkingAcct;

    private String name;
    private LocalDate hireDate;

    public Employee2(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
        this.name = name;
        //Q1
        LocalDate localDateHireDate = LocalDate.of(yearOfHire,monthOfHire,dayOfHire);
        this.hireDate = localDateHireDate;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
    }


    public void createNewChecking(double startAmount) {
        checkingAcct = new Account2(this, AccountType.CHECKING,startAmount);

    }
    public void createNewSavings(double startAmount) {
        savingsAcct = new Account2(this, AccountType.SAVINGS,startAmount);

    }
    public void createNewRetirement(double startAmount) {
        retirementAcct = new Account2(this, AccountType.RETIREMENT,startAmount);
    }


    public String getFormattedAcctInfo() {
      String checking=  checkingAcct.toString();
      String saving =savingsAcct.toString();
      String retirement = retirementAcct.toString();
        return  "ACCOUNT INFO FOR "+ name + ": \n" + checking + saving  + retirement +"\n";
    }

    public void deposit(AccountType acctType, double amt) {
        switch (acctType) {
            case CHECKING -> checkingAcct.makeDeposit(amt);
            case SAVINGS -> savingsAcct.makeDeposit(amt);
            case RETIREMENT -> retirementAcct.makeDeposit(amt);
        }
    }

    public boolean withdraw(AccountType acctType, double amt) {
        switch (acctType) {
            case CHECKING -> checkingAcct.makeWithdrawal(amt);
            case SAVINGS -> savingsAcct.makeWithdrawal(amt);
            case RETIREMENT -> retirementAcct.makeWithdrawal(amt);
        }
        return  true;
    }


}
