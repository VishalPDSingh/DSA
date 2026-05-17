package ch16_LinkedList;

public class LinkedListDemo3 {

    static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        return n1;
    }

    static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node<Integer> headNode = createLinkedList();

        printLinkedList(headNode);
    }
}

class Node<T> {

    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}