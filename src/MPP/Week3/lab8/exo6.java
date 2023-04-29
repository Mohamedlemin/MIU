package MPP.Week3.lab8;

import MPP.Week3.lab7.prob1.partD.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.function.*;

public class exo6 {

//    Example: (String x) -> x.toUpperCase()
//    Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
//    Function<String, String> toUpper2 = String::toUpperCase;
//    Method reference type: Class::instanceMethod

//            A.(Employee e) -> e.getName()
//            B. (Employee e,String s) -> e.setName(s)
//            C. (String s1,String s2) -> s1.compareTo(s2)
//            D. (Integer x,Integer y) -> Math.pow(x,y)
//            E. (Apple a) -> a.getWeight()
//            F. (String x) -> Integer.parseInt(x);
//            G. EmployeeNameComparator comp = new EmployeeNameComparator();
//            (Employee e1, Employee e2) -> comp.compare(e1,e2)

   static Function<Employee,String> emp = Employee::getName;
    static BiConsumer<Employee,String> cuns =  Employee::setName;

    static Comparator<String> compareString = String::compareTo;
    static BiFunction<Integer,Integer,Double> power = Math::pow;

    static Function<String,Integer> parse = Integer::parseInt;

    public static void main(String[] args) {
        //A
        Employee newEmp = new Employee("Med",3994);
        System.out.println(emp.apply(newEmp));
        //B
        cuns.accept(newEmp,"Mohamedlemin");

        //C
        compareString.compare("test","test");
        System.out.println();

        //D
        System.out.println(power.apply(3,4));

        //E
        System.out.println(parse.apply("34433"));

    }


}
