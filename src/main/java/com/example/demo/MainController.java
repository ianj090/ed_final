package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
//    Dash == Dashboard osea la pagina principal de html

//    ------------------------------------------- Class Manager -----------------------------------------

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String fullDash(Model model) {
        model.addAttribute("classes", CoursesLinkedList.toArray());
        model.addAttribute("stored_class", new Class());
        return "resultDash";
    }

    @GetMapping("/addClass")
    public String addClass(Model model) {
        model.addAttribute("class1", new Class());
        return "addClass";
    }

    @PostMapping("/addNewClass")
    public String addNewClass(@ModelAttribute Class class1) {
        class1.ClassActivities = new AssignmentLinkedList();
        CoursesLinkedList.add(class1);
        return "redirect:/";
    }

    @PostMapping("/deleteClass")
    public String removeClass(@RequestParam("delete_value") String stored_class) {
        CoursesLinkedList.delArrayVal(stored_class);
        CoursesLinkedList.remove(stored_class);
        return "redirect:/";
    }

//    ------------------------------------------- Class Information Manager -----------------------------------------

    Class saved_class;

    @PostMapping("/saveClass")
    public String saveClass(@RequestParam("selected_value") String stored_class) {
        saved_class = CoursesLinkedList.find(stored_class);
        return "redirect:/classInformation";
    }

    @RequestMapping(value="/classInformation", method=RequestMethod.GET)
    public String classInformation(Model model) {
//        saved_class.ClassActivities.listNodes();
        model.addAttribute("assignments", saved_class.ClassActivities.toArray());
        model.addAttribute("stored_assignment", new Assignment());
        return "classInformation";
    }

    @GetMapping("/addAssignment")
    public String addAssignment(Model model) {
        model.addAttribute("assignment1", new Assignment());
        return "addAssignment";
    }

    @PostMapping("/addNewAssignment")
    public String addNewAssignment(@ModelAttribute Assignment assignment1) {
        saved_class.ClassActivities.add(assignment1);
        return "redirect:/classInformation";
    }

    @PostMapping("/deleteAssignment")
    public String removeAssignment(@RequestParam("delete_value") String stored_assignment) {
        saved_class.ClassActivities.listNodes();
        saved_class.ClassActivities.delArrayVal(stored_assignment);
        saved_class.ClassActivities.remove(stored_assignment);
        return "redirect:/classInformation";
    }


}
