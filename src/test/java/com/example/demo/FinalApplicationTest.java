package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

 @SpringBootTest
class FinalApplicationTests {

//      -------------------------------------------------------------------------------------------------------------------------------------------------------------

    private CoursesLinkedList courses = new CoursesLinkedList();
    @Test
    void contextLoads() {
        // Adding Classes
        CoursesLinkedList.toArray();
        Class course1 = new Class();
        course1.ClassName = "Test Class 1";
        course1.HomeWork = 80.0f;
        course1.Final = 20.0f;
        course1.ScoreWanted = 80.0f;
        course1.Credits = 3.0f;
        course1.Period = 3;
        course1.WeekDay = "tuesday";
        course1.findTotal();
        course1.findScoreWanted();
        course1.ClassActivities = new AssignmentLinkedList();
        CoursesLinkedList.add(course1);
        Class course2 = new Class();
        course2.ClassName = "Test Class 2";
        course2.Quiz = 70.0f;
        course2.Final = 30.0f;
        course2.ScoreWanted = 100.0f;
        course2.Period = 5;
        course2.WeekDay = "friday";
        course2.findTotal();
        course2.findScoreWanted();
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

//      -------------------------------------------------------------------------------------------------------------------------------------------------------------

        course1.ClassActivities.toArray();
        Assignment assignment1 = new Assignment();
        assignment1.Title = "Test Assignment 1";
        assignment1.TypeOfActivity = "homework";
        assignment1.ScoreOfThisActivity = 50.0f;
        course1.ClassActivities.add(assignment1);
        course1.findaverages();
        course1.findScore();
        Assignment assignment2 = new Assignment();
        assignment2.Title = "Test Assignment 2";
        assignment2.TypeOfActivity = "quiz";
        assignment2.ScoreOfThisActivity = 100.0f;
        course1.ClassActivities.add(assignment2);

        Assignment[] assignmentTestArray = course1.ClassActivities.toArray();
        assertEquals("Test Assignment 1", assignmentTestArray[0].Title); // se salta el o ya que thymeleaf crea un valor null al inicializar el array
        assertEquals("Test Assignment 2", assignmentTestArray[1].Title);
        assertEquals("Test Assignment 1<br>Test Assignment 2<br>", course1.ClassActivities.listNodes());

        course1.ClassActivities.delArrayVal(assignment2.Title);
        course1.ClassActivities.remove(assignment2.Title);
        assertEquals("Test Assignment 1", assignmentTestArray[0].Title);
        assertEquals("Test Assignment 1<br>", course1.ClassActivities.listNodes());

//      -------------------------------------------------------------------------------------------------------------------------------------------------------------

        Class[] testArray2 = CoursesLinkedList.toArray();
        int amount_classes = 0;
        for (int i=0; i<testArray2.length; i++) {
            if (testArray2[i] != null) {
                amount_classes++;
            }
        }
        new ScoreHeap(amount_classes);
        for (int i=0; i<testArray2.length; i++) {
            if (testArray2[i] != null) {
                ScoreHeap.insert(testArray2[i].Score);
            }
        }

        assertEquals(40.0, ScoreHeap.getMax());
        assertEquals(0.0, ScoreHeap.getMin());
        assertEquals(40.0, ScoreHeap.getAverage());
        assertEquals(40.0, ScoreHeap.getWeighted());

//      -------------------------------------------------------------------------------------------------------------------------------------------------------------

        ScheduleBTree.BinaryTree.clear();
        for (int i=0; i<CoursesLinkedList.coursesArray.length; i++) {
            ScheduleBTree.BinaryTree.add(CoursesLinkedList.coursesArray[i]);
        }

        ScheduleBTree.BinaryTree.traverse(ScheduleBTree.BinaryTree.root);

//        assertEquals([], ScheduleBTree.BinaryTree.tuesday);

        assertEquals("Test Class 1", ScheduleBTree.BinaryTree.tuesday[course1.Period - 1].Class_Name);
        assertEquals("tuesday", ScheduleBTree.BinaryTree.tuesday[course1.Period - 1].Week_Day);
        assertEquals(3, ScheduleBTree.BinaryTree.tuesday[course1.Period - 1].Period);

    }
}
