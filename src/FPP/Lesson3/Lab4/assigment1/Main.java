package FPP.Lesson3.Lab4.assigment1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Mohamed",
                LocalDate.of(1997,12,27),
                8000);
        prof1.setNumberOfPublications(10);
        Professor prof2 = new Professor("ali",
                LocalDate.of(1997,12,27),
                8000);
        prof2.setNumberOfPublications(10);
        Professor prof3 = new Professor("sidi",
                LocalDate.of(1997,12,27),
                8000);
        prof3.setNumberOfPublications(10);

        Secretary secretary1  = new Secretary("sara",
                LocalDate.of(1999,12,14),
                5000);
        secretary1.setOvertimeHours(200);
        Secretary secretary2  = new Secretary("houda",
                LocalDate.of(1999,12,14),
                5000);
        secretary2.setOvertimeHours(200);


        DeptEmployee[] deptEmployee =new DeptEmployee[5];
        deptEmployee[0] = prof1;
        deptEmployee[1] = prof2;
        deptEmployee[2] = prof3;
        deptEmployee[3] = secretary1;
        deptEmployee[4] = secretary2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to the sum of all salaries in the department?");
        String res = sc.nextLine();
        if (res.equals("y")){
            double sum = 0.0;
            for (DeptEmployee emp: deptEmployee) {
                sum+= emp.computeSalary();
            }
            System.out.println(sum);
        }


    }
}
