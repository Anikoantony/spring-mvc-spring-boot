package ru.gb.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1")
@ResponseBody
// http://localhost:8180/app/v1/hello
public class HelloController {

    @GetMapping("/hello")
    // http://localhost:8180/app/v1/hello?new=1
    public String hello(@RequestParam(name = "new", required = false, defaultValue = "new") String name)
    {
        return "Hello "+ name + ";";
    }

    @GetMapping("/hello2/{name}")
    public String hello2(@PathVariable String name)
    {
        return "Hello "+ name + ";";
    }
}
