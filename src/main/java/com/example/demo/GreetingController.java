package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

//    @GetMapping("/list")
//    public String print(Model model) {
//        model.addAttribute("greeting", new LinkedList());
////        return LinkedList.listClasses();
//    }

//    @RequestMapping("/add")
//    public String add(String course) {
//        return LinkedList.addClass(course);
//    }
//
//    @RequestMapping("/play")
//    public String play(String song) {
//        return LinkedList.selectClass(song);
//    }

}

//class LinkedList {
//
//    static LinkedList list = new LinkedList();
//    Node head;
//    static Node selected;
//
//    static class Node {
//        String class_name;
//        Node next;
//        Node prev;
//
//        Node(String class_name_val) {
//            prev = null;
//            class_name = class_name_val;
//            next = null;
//        }
//    }
//
//    public static void listClasses() {
//        Node current = list.head;
//
//
//        while (current != null) {
//            result = result + current.class_name + "<br>";
//            current = current.next;
//        }
//    }
//
//    public static String addClass(String name) {
//        Node new_n = new Node(name);
//        new_n.next = null;
//        if (list.head == null) {
//            list.head = new_n;
//        }
//        else {
//            Node last = list.head;
//            while (last.next != null) {
//                last = last.next;
//            }
//            new_n.prev = last;
//            last.next = new_n;
//        }
//        return "Added Successfully";
//    }
//
//    public static String selectClass(String name) {
//        Node current = list.head;
//        while (current != null) {
//            if (current.class_name.equals(name)) {
//                selected = current;
//            }
//            current = current.next;
//        }
//        return "Playing: " + selected.class_name;
//    }
//}