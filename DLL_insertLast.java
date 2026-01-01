class Node {
    int data;
    Node prev;
    Node next;

    Node() {
        prev = next = null;
    }

    Node(int el) {
        data = el;
    }

    Node(int el, Node p, Node n) {
        data = el;
        prev = p;
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

    // insert last node in DLL
    void insertLast(int el) {
        Node xyz = new Node(el);
        Node temp = head;
        if (isEmpty()) {
            head = tail = xyz;
        } else {
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = xyz;
            xyz.prev = temp;
            tail = xyz;
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
        while (temp.prev != null) {
            System.out.print(temp.data + "-->");
            temp = temp.prev;

        }
        System.out.println(head.data + "-->null");
    }
}

public class DLL_insertLast {
    public static void main(String[] args) {
        DLL ob = new DLL();
        ob.insertLast(5);
        ob.insertLast(10);
        ob.insertLast(15);
        ob.insertLast(20);
        ob.insertLast(25);
        ob.insertLast(30);
        ob.insertLast(35);
        ob.insertLast(40);
        ob.insertLast(45);
        ob.insertLast(50);
        ob.displayForward();
        ob.displayBackward();
    }
}
