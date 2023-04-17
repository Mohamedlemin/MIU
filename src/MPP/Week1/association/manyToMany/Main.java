package MPP.Week1.association.manyToMany;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Course c1 = new Course();
        s.addCourse(c1);
        c1.addStudent(s);
    }
}
