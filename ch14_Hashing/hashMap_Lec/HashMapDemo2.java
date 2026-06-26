package ch14_Hashing.hashMap_Lec;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

    public static void main(String[] args) {
        // Key and Value
        // insertion, searching, deletion, udation TC= O(n)

        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Vishal");
        myMap.put(2, "Ram");
        myMap.put(3, "Shayam");
        myMap.put(4, "Radha");
        myMap.put(5, "Rani");
        System.out.println(myMap);

        // update
        myMap.put(2, "Rahul");
        System.out.println(myMap);

        // get
        System.out.println(myMap.get(4));
        System.out.println(myMap.get(7));
        System.out.println(myMap.containsKey(7));
        System.out.println(myMap.getOrDefault(7, "Not Presnt"));

        myMap.replace(2, "Rahul");
        System.out.println(myMap);

        // Iteration
        // Iteration using Entry Set
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println("Key   -> " + entry.getKey());
            System.out.println("Value -> " + entry.getValue());
            System.out.println();
        }

        // Iteration using Entry Set
        for (Integer key : myMap.keySet()) {
            System.out.println("Key   -> " + key);
            System.out.println("Value -> " + myMap.get(key));
            System.out.println();
        }
    }
}
