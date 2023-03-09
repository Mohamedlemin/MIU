package FPP.Lesson3.Lab3.assigment_2;

import FPP.Lesson3.Lab3.assigment_2.employeInfo.Employee2;

import java.util.Scanner;

public class Main {
	Employee2[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee2[3];
		Employee2 Employee3 = new Employee2("Jim Daley", 2000, 9, 4);
		Employee2 Employee2 = new Employee2("Jim Daley", 2000, 9, 4);

		emps[0] = new Employee2("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee2("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee2("Susan Randolph", 1997, 2,13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);



		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}
		else {
			//do nothing..the application ends here
		}
	}
	String getFormattedAccountInfo(){
		StringBuilder info = new StringBuilder();
		for (Employee2 emp: emps) {
			info.append(emp.getFormattedAcctInfo());
		}
		//loop through employees array and get formatted
		//account info for each employee, and assemble into a string
		return info.toString();
	}
}
