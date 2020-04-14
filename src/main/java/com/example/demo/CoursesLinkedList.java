package com.example.demo;

public class CoursesLinkedList {

    public static class Node {
        public Node next;
        public Class data;

        public Node() {
        }

        public Node(Class data) {
            this.data = data;
        }

        public Node(Class data, Node next) {
            this.data = data;
            this.next = next;
        }

        public void setData(Class data) {
            this.data = data;
        }

        public Class getData() {
            return this.data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }

    private static Node root;
    private static int size;
    private static Class[] coursesArray = new Class[5];

    public CoursesLinkedList() {
        root = new Node();
        size = 0;
    }

    public static void add(Class data) {
        Node NewNode = new Node(data);
        NewNode.next = null;
        if (root == null) {
            root = NewNode;
        }
        else {
            Node last = root;
            while (last.next != null) {
                last = last.next;
            }
            last.next = NewNode;
        }
        size += 1;
    }

    public static Class find(String value) {
        Node curr = root;

        while (curr != null) {
            if (curr.data.ClassName.equals(value)) {
                return curr.data;
            }
            curr = curr.next;
        }
        return null;
    }

    public static void remove(String value) {
        Node curr = root;
        Node prev = null;
        if (curr.data == null) {
            curr = root.next;
        }
        while (curr != null) {
            if (curr.data.ClassName.equals(value)) {
                if (curr == root) {
                    root = curr.next;
                    size -= 1;
                    break;
                }
                prev.next = curr.next;
                size -= 1;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public static String listNodes() {
        if (root == null) {
            return "None available";
        }
        Node current = root;
        String result = "";
        if (root.next != null) {
            current = root.next;
        }

        while (current != null) {
            result = result + current.data.ClassName + "<br>";
            current = current.next;
        }
        if (result.equals("")) {
            return "None available";
        }
        return result;
    }

    public static Class[] toArray() {
        if (root == null) {
            return coursesArray;
        }
        Node current = root;
        int i = 0;

        while (current != null) {
            if (i == coursesArray.length) {
                incrSize();
            }
            coursesArray[i] = current.data;
            i++;
            current = current.next;
        }

        return coursesArray;
    }

    public static void incrSize() {
        size = coursesArray.length + 5;
        Class[] copy_array = new Class[size];
        for (int i = 0; i < coursesArray.length; i++) {
            copy_array[i] = coursesArray[i];
        }
        coursesArray = copy_array;
    }

    public static void delArrayVal(String value) {
        for(int i = 0; i < coursesArray.length; i++){
            if (coursesArray[i] != null) {
                if (coursesArray[i].ClassName.equals(value)) {
                    for (int j = i; j < coursesArray.length - 1; j++) {
                        coursesArray[j] = coursesArray[j + 1];
                    }
                    break;
                }
            }
        }
    }

    public static void setSize(int size) {
        CoursesLinkedList.size = size;
    }

    public Node getRoot() {
        return root;
    }

    public static int getSize() {
        return size;
    }

    public void setRoot(Node root) {
        CoursesLinkedList.root = root;
    }
}