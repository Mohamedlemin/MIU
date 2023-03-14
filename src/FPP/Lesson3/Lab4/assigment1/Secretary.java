package FPP.Lesson3.Lab4.assigment1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    private double overtimeHours;


    public Secretary(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }


    @Override
     public final double computeSalary(){
        double salary = super.computeSalary();
        return salary + 12*overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
