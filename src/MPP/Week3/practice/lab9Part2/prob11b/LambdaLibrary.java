package MPP.Week3.practice.lab9Part2.prob11b;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>,Double,Character,List<String>>
    FilterBySalaryAndLastName = (list,salary,letter)-> {
        Predicate<Employee> bySalary = (a) -> a.getSalary() > salary;
        Predicate<Employee> StartFrom = (a) -> a.getLastName().charAt(0)>=letter;
        return list.stream().filter(bySalary.and(StartFrom))
                .map(e-> e.getFirstName()+" "+e.getLastName())
                .sorted()
                .collect(Collectors.toList());
    };
}
