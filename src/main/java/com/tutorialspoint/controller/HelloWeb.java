package com.tutorialspoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexosei on 5/9/17.
 */
@Controller
public class HelloWeb {
    @RequestMapping(value = "/")
    public String print(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return  "hello";
    }
}
