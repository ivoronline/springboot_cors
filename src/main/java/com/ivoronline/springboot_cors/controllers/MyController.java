package com.ivoronline.springboot_cors.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

  @GetMapping("/Hello")
  public String hello() {
    return "Test";
  }

}
