package com.example.demo;

public class AssignmentLinkedList {

    public static class Node {
        public Node next;
        public Assignment data;

        public Node() {
        }

        public Node(Assignment data) {
            this.data = data;
        }

        public Node(Assignment data, Node next) {
            this.data = data;
            this.next = next;
        }

        public void setData(Assignment data) {
            this.data = data;
        }

        public Assignment getData() {
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
    private static Assignment[] assignmentArray = new Assignment[5];

    public AssignmentLinkedList() {
        root = new Node();
        size = 0;
    }

    public void add(Assignment data) {
        Node NewNode = new AssignmentLinkedList.Node(data);
        NewNode.next = null;
        if (root == null) {
            root = NewNode;
        }
        else {
            AssignmentLinkedList.Node last = root;
            while (last.next != null) {
                last = last.next;
            }
            last.next = NewNode;
        }
        size += 1;
    }

    public Node find(Assignment data) {
        Node curr = root;

        while (curr != null) {
            if (curr.getData() == data) {
                return curr;
            }
            curr = curr.getNext();
        }
        return null;
    }

    public boolean remove(Assignment data) {
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

    public String listNodes() {
        Node current = root.next;
        String result = "";

        while (current != null) {
            result = result + current.data.InstructionsOfThisActivity + "<br>";
            current = current.next;
        }
        if (result.equals("")) {
            return "None available";
        }
        System.out.println(result);
        return result;
    }

    public Assignment[] toArray() {
        Node current = root.next;
        int i = 0;

        while (current != null) {
            if (i == assignmentArray.length) {
                incrSize();
            }
            assignmentArray[i] = current.data;
            i++;
            current = current.next;
        }

        return assignmentArray;
    }

    public static void incrSize() {
        size = assignmentArray.length + 5;
        Assignment[] copy_array = new Assignment[size];
        for (int i = 0; i < assignmentArray.length; i++) {
            copy_array[i] = assignmentArray[i];
        }
        assignmentArray = copy_array;
    }

    public void setSize(int size) {
        AssignmentLinkedList.size = size;
    }

    public Node getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    public void setRoot(Node root) {
        AssignmentLinkedList.root = root;
    }
}
