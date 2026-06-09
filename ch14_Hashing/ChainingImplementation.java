package ch14_Hashing;

public class ChainingImplementation {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert(10);
        ht.insert(17);
        ht.insert(24);
    }
}

class Node {
    int key;
    Node next;

    Node(int key) {
        this.key = key;
        this.next = null;
    }
}

class HashTable {
    Node table[] = new Node[7];

    int hash(int key) {
        return key % 7;
    }

    void insert(int key) {
        int index = hash(key);
        Node newNode = new Node(key);
        if (table[index] == null) {
            table[index] = newNode;
            return;
        }
        // Traverse to last node
        Node temp = table[index];

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
}
