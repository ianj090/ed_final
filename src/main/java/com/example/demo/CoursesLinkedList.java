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
    private static String[] coursesArray = new String[1];

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

    public Node find(Class data) {
        Node curr = root;

        while (curr != null) {
            if (curr.getData() == data) {
                return curr;
            }
            curr = curr.getNext();
        }
        return null;
    }

    public boolean remove(Class data) {
        Node curr = root;
        Node prev = null;
        while (curr != null) {
            if (curr.getData() == data) {
                prev.setNext(curr.getNext());
                this.setSize(this.getSize() - 1);
                return true;
            }
            prev = curr;
            curr = curr.getNext();
        }
        return false;
    }

    public static String listNodes() {
        Node current = root.next;
        String result = "";

        while (current != null) {
            result = result + current.data.ClassName + "<br>";
            current = current.next;
        }
        if (result.equals("")) {
            return "No songs added";
        }
        System.out.println(result);
        return result;
    }

    public static String[] toArray() {
        Node current = root.next;
        int i = 0;

        while (current != null) {
            if (i == coursesArray.length) {
                incrSize();
            }
            coursesArray[i] = current.data.ClassName;
            i++;
            current = current.next;
        }

        return coursesArray;
    }

    public static void incrSize() {
        size = coursesArray.length + 1;
        String[] copy_array = new String[size];
        for (int i = 0; i < coursesArray.length; i++) {
            copy_array[i] = coursesArray[i];
        }
        coursesArray = copy_array;
    }

    public void setSize(int size) {
        CoursesLinkedList.size = size;
    }

    public Node getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    public void setRoot(Node root) {
        CoursesLinkedList.root = root;
    }
}
