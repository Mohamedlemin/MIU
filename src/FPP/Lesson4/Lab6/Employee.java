package FPP.Lesson4.Lab6;

import java.util.Arrays;

public class Employee implements Comparable<Employee> {
    int salary;
    String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee emp) {
        int res = this.salary - emp.salary;
        if (res == 0) res = emp.name.compareTo(this.name);
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return name.equals(other.name) && salary == other.salary;

    }

    @Override
    public String toString() {
        return "[ salary =" + this.salary +" , "+  this.name + "]";
    }

    public static void main(String[] args) {
        Employee[] empArr = new Employee[3];
        empArr[0] = new Employee(120000, "Joe");
        empArr [1] = new Employee(95000, "Smith");
        empArr [2] = new Employee (95000, "Joe");
        System.out.println("Sort using Combarable: ");
       Arrays.sort (empArr); System.out.println(Arrays.toString(empArr));

    }
}
