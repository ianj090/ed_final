public class AssignmentLinkedList {

    Node root;
    int size;

    public AssignmentLinkedList() {
        this.root = new Node();
        this.size = 0;
    }

    public Node add(Assignment data) {
        Node NewNode = new Node(data, this.root);
        this.root = NewNode;
        this.size += 1;
        return NewNode;
    }

    public Node find(Assignment data) {
        Node curr = this.root;

        while (curr != null) {
            if (curr.getData() == data) {
                return curr;
            }
            curr = curr.getNext();
        }
        return null;
    }

    public boolean remove(Assignment data) {
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

    // public String printL() {
    // Node curr = this.root;
    // String s = new String("");
    // while (curr != null) {
    // s = s + curr.getData() + ", ";
    // curr = curr.getNext();
    // }
    // return s;
    // }

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
