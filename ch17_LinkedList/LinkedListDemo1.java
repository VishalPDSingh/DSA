package ch17_LinkedList;

class SingleLL {
    // ----------------------------------------------------------
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // --------------------------------------------------------------
    Node head;
    Node tail;

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // display method
    void display() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }
}

public class LinkedListDemo1 {

    public static void main(String[] args) {
        SingleLL n1 = new SingleLL();
        n1.addLast(10);
        n1.addLast(20);
        n1.addLast(30);
        n1.addLast(40);
        n1.addLast(50);
        n1.display();
    }
}
