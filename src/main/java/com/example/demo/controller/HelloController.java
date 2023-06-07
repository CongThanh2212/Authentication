package com.example.demo.controller;

import com.example.demo.model.HelloResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse firstPage() {
        return new HelloResponse("Hello World");
    }
}
