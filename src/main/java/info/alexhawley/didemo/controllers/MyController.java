package info.alexhawley.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.printf("Hello world");
        return "";
    }
}
