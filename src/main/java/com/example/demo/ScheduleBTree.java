package com.example.demo;

import java.util.Arrays;

public class ScheduleBTree {
    static class Node {
        int Period;
        String Class_Name;
        float specific_time;
        String Teacher;
        String Week_Day;
        Node left, right;

        Node(int info, String CN, String WD, String Teach, float time) {
            Period = info;
            Class_Name = CN;
            Week_Day = WD;
            Teacher=Teach;
            specific_time = time;
            left = right = null;
        }


        public String getClass_Name(){
            return Class_Name;
        }

        public String getTeacher(){
            return Teacher;
        }
    }

    static class BinaryTree{
        public static Node root;
        public static Node[] monday = new Node[5];
        public static Node[] tuesday = new Node[5];
        public static Node[] wednesday = new Node[5];
        public static Node[] thursday = new Node[5];
        public static Node[] friday = new Node[5];
        public static float Time;


        public static void add(Class course) {
            root = addRecursive(root, course);
        }

        public static Node addRecursive(Node current, Class course) {
            if (course != null) {
                if (current == null) {
                    return new Node(course.Period, course.ClassName, course.WeekDay,course.Teacher, Time);
                }

                if (Time < current.specific_time) {
                    current.left = addRecursive(current.left, course);
                } else if (Time > current.specific_time) {
                    current.right = addRecursive(current.right, course);
                } else {
                    return current;
                }
            }

            return current;
        }

        public static void calculateTime(Class course) {
            if (course != null) {
                switch (course.WeekDay) {
                    case "monday":
                        Time = course.Period + 0.1f;
                        break;
                    case "tuesday":
                        Time = course.Period + 0.2f;
                        break;
                    case "wednesday":
                        Time = course.Period + 0.3f;
                        break;
                    case "thursday":
                        Time = course.Period + 0.4f;
                        break;
                    case "friday":
                        Time = course.Period + 0.5f;
                        break;
                }
            }
        }

        public static void clear() {
            Arrays.fill(monday, null);
            Arrays.fill(tuesday, null);
            Arrays.fill(wednesday, null);
            Arrays.fill(thursday, null);
            Arrays.fill(friday, null);
        }

        public static void traverse(Node node) {
            if (node != null) {
                traverse(node.left);
                ScheduleBTree.BinaryTree.toArray(node);
                traverse(node.right);
            }
        }

        public static void toArray(Node node) {
            switch (node.Week_Day) {
                case "monday":
                    monday[node.Period - 1] = node;
                    break;
                case "tuesday":
                    tuesday[node.Period - 1] = node;
                    break;
                case "wednesday":
                    wednesday[node.Period - 1] = node;
                    break;
                case "thursday":
                    thursday[node.Period - 1] = node;
                    break;
                case "friday":
                    friday[node.Period - 1] = node;
                    break;
            }
        }
    }
}
