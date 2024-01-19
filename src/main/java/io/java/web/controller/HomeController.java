package io.java.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/", "/home", "/index", "/home.*", "/index.*"})
public class HomeController {
    @GetMapping
    public String home() {
        return "redirect:/api/ping";
    }
}
