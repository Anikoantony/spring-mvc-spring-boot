package ru.gb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.StudentRepository;
import ru.gb.model.Student;

@Controller
//@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/all")
    public String getStudents(Model model)
    {   model.addAttribute("students",studentRepository.generateStudentList());
        return "student";
    }

    @GetMapping("/stud/{id}")
    @ResponseBody
    public Student getStudent(@PathVariable Integer id)
    {
        Student student = studentRepository.returnStudent(id);
        System.out.println(student);
        return student;
    }

    @PostMapping("/studi")
    @ResponseBody
    public void getStudent(@RequestBody Student s)
    {
        System.out.println(s);
    }

}
