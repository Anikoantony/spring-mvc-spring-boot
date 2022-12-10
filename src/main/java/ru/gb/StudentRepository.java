package ru.gb;

import org.springframework.stereotype.Repository;
import ru.gb.model.Student;

import java.util.List;

@Repository
public class StudentRepository {

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
}
