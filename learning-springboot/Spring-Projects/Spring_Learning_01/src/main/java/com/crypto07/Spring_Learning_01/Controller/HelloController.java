package com.crypto07.Spring_Learning_01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld(){

        return "<h1>Hello i am Surya<h1>";

    }

}
