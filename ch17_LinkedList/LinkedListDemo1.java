package ch17_LinkedList;

class LL
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    void addfirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
    }
    void printList()
    {
        if(head == null)
        {
            System.out.println("There no data");
            return;
        }
    }
}


public class LinkedListDemo1 {
    public static void main(String[] args) {
        LL list = new LL();
        list.printList();

    }
}
