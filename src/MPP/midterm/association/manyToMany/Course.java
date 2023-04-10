package MPP.midterm.association.manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Student> list;
    public  Course(){
        this.list = new ArrayList<>();
    }

    public void addStudent(Student s){
        list.add(s);
    }
}
