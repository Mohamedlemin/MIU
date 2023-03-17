package FPP.Lesson9.Lab9.employeebst;



public class EmployeeDriver {

	public static void main(String[] args) {
		new EmployeeDriver();

	}
	public EmployeeDriver() {
		NameComparator nameComp = new NameComparator();
//		/* uncomment when you have created EmployeeBST
		EmployeeBST bst = new EmployeeBST(nameComp);
		var emp1 = new Employee("George", 40000, 1996,11,5);
		var emp2 = new Employee("Dave", 50000, 2000, 1, 3);
		bst.insert(emp1);
		bst.insert(emp2);
		bst.insert(new Employee("Richard", 45000, 2001, 2, 7));
		bst.insert(new Employee("Sally", 80000, 1986,3,23));
		bst.printTree();
		System.out.println(bst.find(emp2));

//		List<Employee> myArray = new ArrayList<>();
//		myArray.add(new Employee("George", 40000, 1996,11,5));
//		myArray.add(new Employee("Dave", 50000, 2000, 1, 3));
//		myArray.add(new Employee("Sally", 45000, 2001, 2, 7));
//		myArray.add(new Employee("Richard", 80000, 1986,3,23));
//
//		Collections.sort(myArray,nameComp);
//		System.out.println(myArray);

	}
}
