package FPP.Lesson3.Lab4.assigment1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
    private int numberOfPublications;

    public Professor(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
