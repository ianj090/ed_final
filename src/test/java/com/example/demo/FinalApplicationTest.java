package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FinalApplicationTests {

    private CoursesLinkedList courses = new CoursesLinkedList();
    @Test
    void contextLoads() {
        // Adding Classes
        CoursesLinkedList.toArray();
        Class course1 = new Class();
        course1.ClassName = "Test Class 1";
        course1.ClassActivities = new AssignmentLinkedList();
        CoursesLinkedList.add(course1);
        Class course2 = new Class();
        course2.ClassName = "Test Class 2";
        course2.ClassActivities = new AssignmentLinkedList();
        CoursesLinkedList.add(course2);
        Class course3 = new Class();
        course3.ClassName = "Test Class 3";
        course3.ClassActivities = new AssignmentLinkedList();
        CoursesLinkedList.add(course3);

        Class[] testArray = CoursesLinkedList.toArray();
        assertEquals("Test Class 1", testArray[1].ClassName); // se salta el o ya que thymeleaf crea un valor null al inicializar el array
        assertEquals("Test Class 2", testArray[2].ClassName);
        assertEquals("Test Class 3", testArray[3].ClassName);
        assertEquals("Test Class 1<br>Test Class 2<br>Test Class 3<br>", CoursesLinkedList.listNodes());

        CoursesLinkedList.delArrayVal(course3.ClassName);
        CoursesLinkedList.remove(course3.ClassName);
        assertEquals("Test Class 1", testArray[1].ClassName);
        assertEquals("Test Class 2", testArray[2].ClassName);
        assertEquals("Test Class 1<br>Test Class 2<br>", CoursesLinkedList.listNodes());

        course1.ClassActivities.toArray();
        Assignment assignment1 = new Assignment();
        assignment1.Title = "Test Assignment 1";
        course1.ClassActivities.add(assignment1);
        Assignment assignment2 = new Assignment();
        assignment2.Title = "Test Assignment 2";
        course1.ClassActivities.add(assignment2);

        Assignment[] assignmentTestArray = course1.ClassActivities.toArray();
        assertEquals("Test Assignment 1", assignmentTestArray[0].Title); // se salta el o ya que thymeleaf crea un valor null al inicializar el array
        assertEquals("Test Assignment 2", assignmentTestArray[1].Title);
        assertEquals("Test Assignment 1<br>Test Assignment 2<br>", course1.ClassActivities.listNodes());

        course1.ClassActivities.delArrayVal(assignment2.Title);
        course1.ClassActivities.remove(assignment2.Title);
        assertEquals("Test Assignment 1", assignmentTestArray[0].Title);
        assertEquals("Test Assignment 1<br>", course1.ClassActivities.listNodes());


    }



}