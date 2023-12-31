package com.example.springgreeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting() {
        return "index";
    }

    @GetMapping("/test")
    public String test(@RequestParam String test){
        System.out.println(test);
        return "index";
    }
    @PostMapping("/a")
    public String save(Student test){
        System.out.println(test);
        return "index";
    }
}