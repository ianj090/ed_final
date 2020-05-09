package com.example.demo;

public class Runner {
    public static void main(String[] args) {
        CoursesLinkedList courses = new CoursesLinkedList();
//        Class class1 = new Class("Math", "Christiaan", "Samuel", 3, "Math yeah");
//        courses.add(class1);
//        System.out.println(courses.find(class1).getData().getClassName());
//        System.out.println(courses.find(class1).getData().getTeacher());
//        System.out.println(courses.find(class1).getData().getTA());
//        System.out.println(courses.find(class1).getData().getCredits());
//        System.out.println(courses.find(class1).getData().getDescripcion());

        AssignmentLinkedList obj = new AssignmentLinkedList();
        Assignment homework1 = new Assignment();
        homework1.setInstructionsOfThisActivity(
                "Creat a Java Class using classes and learned knowledge acquired in the course.");
        homework1.setScoreOfThisActivity(89.21);
        obj.add(homework1);
        Assignment homework2 = new Assignment();
        obj.add(homework2);
        System.out.println(obj.find(homework1).getData().getDateAdded().toString());

        ScoreHeap obj2 = new ScoreHeap(100);
        obj2.insert(99);
        obj2.insert(1090);
        obj2.insert(0);
        obj2.insert(98);
        obj2.insert(90);
        obj2.insert(100);
        System.out.println(obj2.getMax());
        System.out.println(obj2.getMin());
    }
}
