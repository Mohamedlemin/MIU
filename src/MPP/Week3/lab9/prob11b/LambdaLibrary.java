package MPP.Week3.lab9.prob11b;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction <List<Employee>, Double, Character,List<String>>
    getFirstAndLastName  = (list,salary,letter)-> {
        Predicate<Employee> SalaryGreatThan10Th = (a) -> a.getSalary() > salary;
        Predicate<Employee> LastNameStartWithN_z = (a) -> a.getLastName().charAt(0)>=letter;

       return list.stream()
                .filter(SalaryGreatThan10Th.and(LastNameStartWithN_z))
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .sorted()
                .collect(Collectors.toList());
    };
}
