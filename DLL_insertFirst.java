class Node {
    int data;
    Node previous;
    Node next;

    Node() {
        previous = next = null;
    }

    Node(int d) {
        data = d;
        previous = next = null;
    }

    Node(int d, Node p, Node n) {
        data = d;
        previous = p;
        next = n;
    }
}

class DLL {
    Node head, tail;

    DLL() {
        head = tail = null;
    }

    boolean isEmpty() {
        return tail == null;
    }

    void insertFirst(int el) {
        Node xyz = new Node(el);

        if (isEmpty()) {
            head = tail = xyz;
        } else {
            head.previous = xyz;
            xyz.next = head;
            head = xyz;
        }
    }

    void displayForward() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(temp.data + "-->null");
    }

    void displayBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.previous;

        }
        System.out.println("-->null");
    }

}

public class DLL_insertFirst {
    public static void main(String[] args) {
        DLL ob = new DLL();
        ob.insertFirst(30);
        ob.insertFirst(27);
        ob.insertFirst(24);
        ob.insertFirst(21);
        ob.insertFirst(18);
        ob.insertFirst(15);
        ob.insertFirst(12);
        ob.insertFirst(9);
        ob.insertFirst(6);
        ob.insertFirst(3);

        ob.displayForward();
        ob.displayBackward();
    }
}
