package ch16_LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        Node<String> n1 = new Node<>("Vishal");
        System.out.println(n1);
        System.out.println(n1.data);
        System.out.println(n1.next);
    }
}

// Genrics Class
class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}