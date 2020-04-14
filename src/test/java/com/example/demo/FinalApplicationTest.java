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

        

    }



}