package ru.gb;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import ru.gb.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepository {

    List<Student> students;

    @Override
    public String toString() {
        return "StudentRepository{" +
                "students=" + students +
                '}';
    }



    public void add(Student student)
    {
        students.add(student);
    }

    @PostConstruct
    public void init()
    {
        students = new ArrayList<>(Arrays.asList(
                new Student(1L,"Ara"),
                new Student(2L,"Gosha")
        ));
    }

    public List<Student> generateStudentList()
    {
        return List.of(
                new Student(),
                new Student(),
                new Student(),
                new Student(),
                new Student()


        );

    }

    public Student returnStudent(Integer idd)
    {
        return generateStudentList().get(idd);
    }
}
