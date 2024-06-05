package com.keyin.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin
public class GreetingController {
    @GetMapping("hello")
    // @RequestParam allows you to pass parameters to the endpoint
    // Example: localhost:8080/hello?name=John
    public Greeting greeting(@RequestParam("name") String name) {
        Greeting greeting = new Greeting();
        greeting.setGreeting("Hello, ");
        greeting.setName(name);
        return greeting;
    }
}
