package com.app.hello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC-1
    @GetMapping("/hello1")
    public String sayHello1(){
        return "Hello from BridgeLabz";
    }


    //UC-2
    @GetMapping("/hello2")
    public String sayHello2(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz";
    }

    //UC-3
    @GetMapping("/hello3/{name}")
    public String sayHello3(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz";
    }

    //UC-4
    @PostMapping("/hello4")
    public String sayHello4(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from Bridgelabz";
    }

    //UC-5
    @PutMapping("/hello5/{firstName}")
    public String sayhello5(@PathVariable String firstName, @RequestParam String lastName){
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}
