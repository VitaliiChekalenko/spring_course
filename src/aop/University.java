package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {

    List<Student> students = new ArrayList<>();

    public void addStudents(){

        Student st1 = new Student("Vitalii", 4, 9.0);
        Student st2 = new Student("Elena", 3, 9.2);
        Student st3 = new Student("Alex", 1, 9.9);

        students.add(st1);
        students.add(st2);
        students.add(st3);

    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents ");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }

}
