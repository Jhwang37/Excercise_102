package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwoVarController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("var1", "Helloooo\n");
        model.addAttribute("var2", "ooooo");
        return "hometemplate";
    }

}
