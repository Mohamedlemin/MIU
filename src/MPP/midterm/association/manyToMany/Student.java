package MPP.midterm.association.manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<Course> list;
    public Student() {
        list = new ArrayList<>();
    }
    public void addCourse(Course course){
        list.add(course);
        course.addStudent(this);
    }
}
