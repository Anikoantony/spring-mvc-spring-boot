package ru.gb.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1")
@ResponseBody
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "arg", required = false, defaultValue = "new") String name)
    {
        return "Hello "+ name + ";";
    }

    @GetMapping("/hello2/{name}")
    public String hello2(@PathVariable String name)
    {
        return "Hello "+ name + ";";
    }
}
