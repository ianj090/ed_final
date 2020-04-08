package com.example.demo;

public class Runner {
    public static void main(String[] args) {
        CoursesLinkedList courses = new CoursesLinkedList();
        Class class1 = new Class("Math", "Christiaan", "Samuel", 3, "Math yeah");
        courses.add(class1);
        System.out.println(courses.find(class1).getData().getClassName().toString());
        System.out.println(courses.find(class1).getData().getTeacher().toString());
        System.out.println(courses.find(class1).getData().getTA().toString());
//        System.out.println(courses.find(class1).getData().getCredits().toString());
        System.out.println(courses.find(class1).getData().getDescripcion().toString());

        AssignmentLinkedList obj = new AssignmentLinkedList();
        Assignment homework1 = new Assignment();
        homework1.setInstructionsOfThisActivity(
                "Creat a Java Class using classes and learned knowledge acquired in the course.");
        homework1.setScoreOfThisActivity(89.21);
        obj.add(homework1);
        Assignment homework2 = new Assignment();
        obj.add(homework2);
        System.out.println(obj.find(homework1).getData().getDateAdded().toString());
    }
}
