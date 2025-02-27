package com.app.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC-1
    @GetMapping("/hello1")
    public String sayHello1(){
        return "Hello from BridgeLabz";
    }

}
