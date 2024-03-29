package MPP.Week3.lab9.prob11a;

import java.util.*;
import java.util.function.Function;
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

		Predicate<Employee> SalaryGreatThan10Th = (a) -> a.getSalary() > 100000;
		Predicate<Employee> LastNameStartWithN_z = (a) -> a.getLastName().charAt(0)>='N';

		emps.stream()
				.filter(SalaryGreatThan10Th.and(LastNameStartWithN_z))
				.map(employee -> employee.getFirstName() + " " + employee.getLastName())
				.sorted()
				.forEach(System.out::println);


//		String str = "123";
//		int num = Integer.parseInt(str);
//		System.out.println(num);
//
//
//		String str4 = "123";
//		Function<String, Integer> num4 = Integer::parseInt;
//		num4.apply(str4);




	}


}
