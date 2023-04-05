package MPP.Week1.Lab2.prob1;

public class Student {
    String name;
    GradeReport grp;

    public Student(String name) {
        this.name = name;
        grp = new GradeReport(this);
    }
}
