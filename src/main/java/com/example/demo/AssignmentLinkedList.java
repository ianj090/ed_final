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

    private Node root;
    private static int size;
    private static Assignment[] assignmentArray = new Assignment[5];

    public AssignmentLinkedList() {
        root = new Node();
        size = 0;
    }

    public void add(Assignment data) {
        Node NewNode = new Node(data);
        NewNode.next = null;
        if (root == null) {
            root = NewNode;
        }
        else if (root.data == null){
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

    public void remove(String value) {
        Node curr = root;
        Node prev = null;
        while (curr != null) {
            if (curr.data.Title.equals(value)) {
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

    public String listNodes() {
        if (root == null) {
            return "None available";
        }
        Node current = root;
        String result = "";

        while (current != null) {
            result = result + current.data.Title + "<br>";
            current = current.next;
        }
        if (result.equals("")) {
            return "None available";
        }
        return result;
    }

    public Assignment[] toArray() {
        if (root == null) {
            return assignmentArray;
        }
        Node current = root;
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

    public void delArrayVal(String value) {
        for(int i = 0; i < assignmentArray.length; i++){
            if(assignmentArray[i].Title.equals(value)){
                for(int j = i; j < assignmentArray.length - 1; j++){
                    assignmentArray[j] = assignmentArray[j+1];
                }
                break;
            }
        }
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
        this.root = root;
    }
}
