package MPP.Week3.practice.lab9Part2.prob11a;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		System.out.println(/*implement */);

		Predicate<Employee> bySalary = (a) -> a.getSalary() > 100000;
		Predicate<Employee> StartFrom = (a) -> a.getLastName().charAt(0)>='N';

		List<String> empsFiltered =emps.stream()
				.filter(bySalary.and(StartFrom))
				.map(emp -> emp.getFirstName() + " " + emp.getLastName())
				.sorted()
				.collect(Collectors.toList());

		System.out.println(empsFiltered);


	}


}
