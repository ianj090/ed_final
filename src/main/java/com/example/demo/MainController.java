package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
//    Dash == Dashboard osea la pagina principal de html

//    @GetMapping("/")
//    public String greetingDash(Model model) {
//        CoursesLinkedList courses = new CoursesLinkedList();
//        model.addAttribute("courses", courses);
//        return "welcomeDash";
//    }

    @GetMapping("/addClass")
    public String addClass(Model model) {
        model.addAttribute("class1", new Class());
        return "addClass";
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String fullDash(Model model) {
        CoursesLinkedList.listNodes();
        model.addAttribute("classes", CoursesLinkedList.toArray());
        model.addAttribute("stored_class", new Class());
        return "resultDash";
    }

    @PostMapping("/addNewClass")
    public String addNewClass(@ModelAttribute Class class1) {
        CoursesLinkedList.add(class1);
        return "redirect:/";
    }

    @PostMapping("/deleteClass")
    public String removeClass(@RequestParam("delete_value") String stored_class) {
        CoursesLinkedList.delArrayVal(stored_class);
        CoursesLinkedList.remove(stored_class);
        return "redirect:/";
    }

//    @GetMapping("/addAssignment")
//    public String addAssignment(Model model) {
//        model.addAttribute("assignment1", new Assignment());
//        return "addAssignment";
//    }
//
//    @PostMapping("/test")
//    public String testDash(@ModelAttribute Assignment assignment1, Model model) {
//        Class course = CoursesLinkedList.copy;
//        System.out.println(assignment1.DateDue);
//        System.out.println(course.toString());
//        System.out.println(course.ClassName);
////        CoursesLinkedList.Node course_v = CoursesLinkedList.find(course);
//        course.ClassActivities.add(assignment1);
//        course.ClassActivities.listNodes();
//        model.addAttribute("assignments", course.ClassActivities.toArray());
//        return "testDash";
//    }

}
