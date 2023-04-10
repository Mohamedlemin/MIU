package MPP.midterm.association.oneToMany;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> list ;
    String name;
    public School(String name){
        this.name = name;
        list = new ArrayList<>();
        addStudent(new Student());
    }
    public void addStudent(Student s){
        list.add(s);
    }
}
