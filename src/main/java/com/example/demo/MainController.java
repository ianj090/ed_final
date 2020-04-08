package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
//    Dash == Dashboard osea la pagina principal de html
    @GetMapping("/")
    public String greetingDash(Model model) {
        CoursesLinkedList courses = new CoursesLinkedList();
        model.addAttribute("courses", courses);
        return "welcomeDash";
    }

    @GetMapping("/addClass")
    public String addClass(Model model2) {
        model2.addAttribute("class1", new Class());
        return "addClass";
    }

    @PostMapping("/")
    public String fullDash(@ModelAttribute Class course, Model model) {
        model.addAttribute("name", course.ClassName);
        return "resultDash";
    }

}
