package com.simple.simpleTranslator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

  @GetMapping("/")
  public String home(Model model) {
    return "index"; // Return the name of the HTML file
  }

  @PostMapping("/process") // Handle form submission with POST method
  public String processInput(@RequestParam("userInput") String userInput, Model model) {
    // Process the userInput here (e.g., convert to uppercase)
    String processedOutput = userInput.toUpperCase();
    model.addAttribute("output", processedOutput); // Add processed output to model
    return "index"; // Return the same HTML file to display output
  }
}