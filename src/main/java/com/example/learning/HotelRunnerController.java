package com.example.learning;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelRunnerController {
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
