public class Node {
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
