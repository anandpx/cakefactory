package com.example.cakefactory.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/design")
public class DesignTacoController {

  @GetMapping
  public String showDesignForm(Model model) {
	  System.out.println("In show design form");
     model.addAttribute("message", "Hello Cakefactory");
    return "design";
  }
  
}