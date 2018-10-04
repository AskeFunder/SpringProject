package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController
{

    @Autowired
    AbstractRepository<Human> humanRepository = new HumanRepository();


    String string = "Frederik lugter af bæ";


    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("msg", string);
        return "testform";
    }

    @PostMapping("/")
    public String processForm()
    {

        return "index";
    }

}