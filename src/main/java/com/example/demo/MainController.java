package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

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
        class1.findTotal();
        class1.findScoreWanted();
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
        saved_class.findaverages();
        saved_class.findScore();
        return "redirect:/classInformation";
    }

    @PostMapping("/deleteAssignment")
    public String removeAssignment(@RequestParam("delete_value") String stored_assignment) {
        saved_class.ClassActivities.listNodes();
        saved_class.ClassActivities.delArrayVal(stored_assignment);
        saved_class.ClassActivities.remove(stored_assignment);
        return "redirect:/classInformation";
    }

//    ------------------------------------------- Grade Manager -----------------------------------------

    @RequestMapping(value="/gradeManager", method=RequestMethod.GET)
    public String gradeManager(Model model) {
        int amount_classes = 0;
        for (int i=0; i<CoursesLinkedList.coursesArray.length; i++) {
            if (CoursesLinkedList.coursesArray[i] != null) {
                amount_classes++;
            }
        }
        new ScoreHeap(amount_classes);
        for (int i=0; i<CoursesLinkedList.coursesArray.length; i++) {
            if (CoursesLinkedList.coursesArray[i] != null) {
                ScoreHeap.insert(CoursesLinkedList.coursesArray[i].Score);
            }
        }

        model.addAttribute("max_val", ScoreHeap.getMax());
        model.addAttribute("min_val", ScoreHeap.getMin());
        model.addAttribute("average", ScoreHeap.getAverage());
        model.addAttribute("weighted_average", ScoreHeap.getWeighted());
        model.addAttribute("classes", CoursesLinkedList.toArray());
        return "gradesDash";
    }

    @RequestMapping(value="/schedule", method=RequestMethod.GET)
    public String Schedule(Model model) {

        ScheduleBTree.BinaryTree.clear();
        for (int i=0; i<CoursesLinkedList.coursesArray.length; i++) {
            ScheduleBTree.BinaryTree.add(CoursesLinkedList.coursesArray[i]);
        }

        ScheduleBTree.BinaryTree.traverse(ScheduleBTree.BinaryTree.root);

        model.addAttribute("monday_courses", ScheduleBTree.BinaryTree.monday);
        model.addAttribute("tuesday_courses", ScheduleBTree.BinaryTree.tuesday);
        model.addAttribute("wednesday_courses", ScheduleBTree.BinaryTree.wednesday);
        model.addAttribute("thursday_courses", ScheduleBTree.BinaryTree.thursday);
        model.addAttribute("friday_courses", ScheduleBTree.BinaryTree.friday);

        return "scheduleDash";
    }

}
