package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

    @RequestMapping("/home")
    public String home() {
        System.out.println("Home URL");
        return  "index";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("name", "Prashant Kumar Jha");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Prashant Kumar");
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
