package MPP.Week3.lab8.comparator2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		EmployeeSalaryComparator salaryComparator = new EmployeeSalaryComparator();
		 if(e1.name.compareTo(e2.name) == 0){
			 return salaryComparator.compare(e1, e2);
		 }
		else return e1.name.compareTo(e2.name);
	}
}
