package MPP.Week3.inclassExo;

import MPP.Week3.lab8.comparator2.Employee;

import java.util.List;
import java.util.function.Function;

public class Account {
    private String ownerName;
    private int balance;
    private int acctId;

    public Account(String ownerName, int balance, int acctId) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.acctId = acctId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public int getAcctId() {
        return acctId;
    }
}

class main {
    public static void main(String[] args) {
        Function<Account , Integer> byBalance  = e -> e.getBalance();
        Function<Account , String> byOwnName = e -> e.getOwnerName();

//        public void sorted(List<Account> accts , )
    }
}