package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

}