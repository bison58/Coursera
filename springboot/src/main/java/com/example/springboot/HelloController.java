package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        // 1. Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // 2. Define a format pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 3. Convert to String
        String formattedDate = now.format(formatter);

        return "Hello, "+formattedDate;
    }
}
