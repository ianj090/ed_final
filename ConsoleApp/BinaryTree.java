package com.example.demo;

import java.util.Arrays;

public class ScheduleBTree {
    static class Node {
        float Period;
        String Class_Name;
        Node left, right;

        Node(float info, String CN) {
            Period = info;
            Class_Name = CN;
            left = right = null;
        }
    }

    static class BinaryTree{
        public static Node root;
        public static Node[] monday = new Node[CoursesLinkedList.coursesArray.length];
        public static Node[] tuesday = new Node[CoursesLinkedList.coursesArray.length];
        public static Node[] wednesday = new Node[CoursesLinkedList.coursesArray.length];
        public static Node[] thursday = new Node[CoursesLinkedList.coursesArray.length];
        public static Node[] friday = new Node[CoursesLinkedList.coursesArray.length];


        public static void add(Class course) {
            root = addRecursive(root, course);
        }

        public static Node addRecursive(Node current, Class course) {
            if (course != null) {
                if (current == null) {
                    return new Node(course.Time, course.ClassName);
                }

                if (course.Time < current.Period) {
                    current.left = addRecursive(current.left, course);
                } else if (course.Time > current.Period) {
                    current.right = addRecursive(current.right, course);
                } else {
                    return current;
                }
            }

            return current;
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
            if (monday.length < CoursesLinkedList.coursesArray.length) {
                incrArraySize();
            }
            if (node.Period < 1) {
                for (int i=0; i<monday.length; i++) {
                    if (monday[i] == null) {
                        monday[i] = node;
                        break;
                    }
                }
            }
            else if (node.Period < 2) {
                for (int i=0; i<tuesday.length; i++) {
                    if (tuesday[i] == null) {
                        tuesday[i] = node;
                        break;
                    }
                }
            }
            else if (node.Period < 3) {
                for (int i=0; i<wednesday.length; i++) {
                    if (wednesday[i] == null) {
                        wednesday[i] = node;
                        break;
                    }
                }
            }
            else if (node.Period < 4) {
                for (int i=0; i<thursday.length; i++) {
                    if (thursday[i] == null) {
                        thursday[i] = node;
                        break;
                    }
                }
            }
            else if (node.Period < 5) {
                for (int i=0; i<friday.length; i++) {
                    if (friday[i] == null) {
                        friday[i] = node;
                        break;
                    }
                }
            }
        }

        public static void incrArraySize() {
            int size = monday.length + 5;
            Node[] copy_array = new Node[size];
            System.arraycopy(monday, 0, copy_array, 0, monday.length);
            monday = copy_array;

            copy_array = new Node[size];
            System.arraycopy(tuesday, 0, copy_array, 0, tuesday.length);
            tuesday = copy_array;

            copy_array = new Node[size];
            System.arraycopy(wednesday, 0, copy_array, 0, wednesday.length);
            wednesday = copy_array;

            copy_array = new Node[size];
            System.arraycopy(thursday, 0, copy_array, 0, thursday.length);
            thursday = copy_array;

            copy_array = new Node[size];
            System.arraycopy(friday, 0, copy_array, 0, friday.length);
            friday = copy_array;
        }
    }
}