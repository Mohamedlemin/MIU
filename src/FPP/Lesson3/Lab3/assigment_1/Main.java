package FPP.Lesson3.Lab3.assigment_1;

public class Main {
    public static void main(String[] args) {
        Employee employee =new Employee(
                "Mohamed","lemine",
                80_000,2024,1,2
        );
        Account checkingAccount = new Account(employee,AccountType.CHECKING);
        checkingAccount.makeDeposit(300);
        Account retirementAccount = new Account(employee,AccountType.RETIREMENT);
        retirementAccount.makeDeposit(300);
        Account savingAccount = new Account(employee,AccountType.SAVINGS);
        savingAccount.makeDeposit(300);
        System.out.println(checkingAccount.toString() +" \n "
                + retirementAccount.toString() +"\n"
                +savingAccount.toString() );
    }
}
