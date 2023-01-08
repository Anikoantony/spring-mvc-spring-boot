package ru.gb.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.gb.ProductRepository;
import ru.gb.StudentRepository;
import ru.gb.model.Student;

@Controller
//  http://localhost:8180/app/show_form
public class MainController {

    private StudentRepository studentRepository;



    public MainController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @GetMapping("/show_form")
    //@RequestBody
    public String show()
    {return "form";}

    @GetMapping("/stud_add")
    public String addStudent(@RequestParam Long id, @RequestParam String name)
    {
        Student student = new Student(id,name);
        studentRepository.add(student);
        return "redirect:/stud_all";
    }

    @GetMapping("/stud_all")
    @ResponseBody
    public String allStudent()
    {
        return studentRepository.toString();
    }




}
