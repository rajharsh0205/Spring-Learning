package com.tit.uc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloBridgeLabz(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello";  // returns hello.html view
    }
}
