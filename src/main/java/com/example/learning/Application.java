package com.example.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

@RestController
class GreetingController {

    @GetMapping("/")
    public String getGreeting() {
        return "Welcome to Spring Boot on HTTPS!";
    }

//    @PostMapping("/callback")
//    public String handleCallback(
////            @RequestParam(name = "token") String token,
////            @RequestParam(name = "hr_id") String hrId,
//            @RequestBody Reservation reservation) {
//        // Handle the incoming data here
//        System.out.println(reservation);
//        // You can access 'token', 'hrId', and 'jsonData'
//        // Perform your processing and return a response if needed
//        return "Response"; // You can return a response message or object here
//    }
    @PostMapping("/callback")
    public String handleCallback(
            @RequestParam(name = "token") String token,
            @RequestParam(name = "hr_id") String hrId,
            @RequestBody MultiValueMap<String, String> formData) {
        // Handle the incoming data here
        String jsonData = formData.getFirst("data"); // Extract data from the form data
        System.out.println(jsonData);
        // You can access 'token', 'hrId', and 'jsonData'
        // Perform your processing and return a response if needed
        return "Response"; // You can return a response message or object here
    }
}
