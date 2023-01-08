package ru.gb.api;


import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v2")
// http://localhost:8180/app/v2/hello?name=HELLO!!!
public class HelloBodyController {

    //Client (Browser) <>

    @GetMapping("/hello")
    public String helloWithParam(@RequestParam(defaultValue = "Java") String name, Model model)
    {
        model.addAttribute("name",name);

        //return "hello" + name;
        return "hello";
    }
}
