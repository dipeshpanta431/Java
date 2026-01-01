// class Node {
//     int data;
//     Node next;

//     Node() {
//         next = null;
//     }

//     Node(int el) {
//         data = el;
//     }

//     Node(int el, Node n) {
//         data = el;
//         next = n;
//     }
// }

// class SLL {
//     Node head, tail;

//     SLL() {
//         head = tail = null;
//     }

//     boolean isEmpty() {

//         return tail == null;
//     }

//     // insert a node at the last
//     void insertLast(int el) {
//         Node xyz = new Node(el);
//         Node temp = tail;
//         if (isEmpty()) {
//             head = tail = xyz;
//         } else {
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = xyz;
//             xyz.next = null;

//         }

//     }

//     // delete last node
//     void deleteLast() {
//         Node current = null;
//         Node temp = head;
//         if (head == tail) {
//             head = tail = null;

//         } else {

//             while (temp.next != null) {
//                 current = temp;
//                 temp = temp.next;
//             }
//             current.next = null;
//             tail = current;
//         }

//     }

//     void display() {
//         Node temp = head;
//         while (temp.next != null) {
//             System.out.print(temp.data + "-->");
//             temp = temp.next;
//         }
//         System.out.println(temp.data + "-->null");
//     }

// }

// public class SLL_insertLast {
//     public static void main(String[] args) {
//         SLL ob = new SLL();
//         ob.insertLast(2);
//         ob.insertLast(15);
//         ob.insertLast(20);
//         ob.insertLast(25);
//         ob.insertLast(30);
//         ob.insertLast(32);
//         ob.insertLast(40);
//         ob.display();
//         ob.deleteLast();
//         ob.display();

//     }
// }
class Node {
    int data;
    Node next;

    Node(int el) {
        data = el;
        next = null;
    }
}

class SLL {
    Node head, tail;

    SLL() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    // Insert a node at the last
    void insertLast(int el) {
        Node newNode = new Node(el);
        if (isEmpty()) {
            head = tail = newNode; // First node in the list
        } else {
            tail.next = newNode; // Attach new node at the end
            tail = newNode; // Update tail reference
        }
    }

    // Delete last node
    void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head == tail) { // Only one node
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) { // Find second last node
            temp = temp.next;
        }
        temp.next = null;
        tail = temp; // Update tail to second last node
    }

    // Display the list
    void display() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " --> " : " --> null"));
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SLL_insertLast {
    public static void main(String[] args) {
        SLL ob = new SLL();

        // Insert elements
        ob.insertLast(2);
        ob.insertLast(15);
        ob.insertLast(20);
        ob.insertLast(25);
        ob.insertLast(30);
        ob.insertLast(32);
        ob.insertLast(40);

        System.out.println("Linked List after insertions:");
        ob.display();

        // Delete last element
        ob.deleteLast();
        System.out.println("Linked List after deleting last node:");
        ob.display();
    }
}
