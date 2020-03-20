public class LinkedList{
    private class Node{
        private Node next;
        private int data;

        private Node() {}

        private Node(int data){
            this.data = data;
        }

        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }

    Node root;
    int size;

    public LinkedList(){
        this.root = new Node();
        this.size = 0;
    }

    public Node add(int data){
        Node NewNode = new Node(data,this.root);
        this.root = NewNode;
        this.size += 1;
        return NewNode;
    }

    public Node find(int data){
        Node curr = this.root;

        while (curr != null){
            if (curr.getData() == data){
                return curr;
            }
            curr = curr.getNext();
        }
        return null;
    }

    public boolean remove(int data){
        Node curr = this.root;
        Node prev = null;
        while (curr != null){
            if (curr.getData() == data){
                prev.setNext(curr.getNext());
                this.setSize(this.getSize() - 1);
                return true;
            }
            prev = curr;
            curr = curr.getNext();
        }
        return false;
    }

    public String printL(){
        Node curr = this.root;
        String s = new String("");
        while (curr != null){
            s = s + curr.getData() + ", ";
            curr = curr.getNext();
        }
        return s;
    }

    public void setSize(int size) {
        this.size = size;
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


