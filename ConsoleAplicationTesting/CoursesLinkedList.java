public class CoursesLinkedList {

    public class Node {
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

    Node root;
    int size;

    public CoursesLinkedList() {
        this.root = new Node();
        this.size = 0;
    }

    public Node add(Class data) {
        Node NewNode = new Node(data, this.root);
        this.root = NewNode;
        this.size += 1;
        return NewNode;
    }

    public Node find(Class data) {
        Node curr = this.root;

        while (curr != null) {
            if (curr.getData() == data) {
                return curr;
            }
            curr = curr.getNext();
        }
        return null;
    }

    public boolean remove(Class data) {
        Node curr = this.root;
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
