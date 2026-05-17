package ch16_LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        System.out.println(n1);// ch16_LinkedList.Node@11c20519
        System.out.println(n1.data);// 10
        System.out.println(n1.next);// null

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        // next = null;
    }
}
