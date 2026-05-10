package ch8_Array.Array;

public class ArrayDemo1 {
    public static void main(String[] args) {

        // Declartion of array
        // int arr[];

        int arr[] = null;
        System.out.println(arr); // null

        // Declaration and Initialization
        int arr1[] = new int[5];
        System.out.println(arr1); // [I@3bd94634 hash code, this is not address
        // toString hashcode hexadecimal String

        // Declaration and Initialization
        int a[] = new int[5];
        System.out.println(a.toString()); // [I@120d6fe6
        System.out.println(a); // hash code

        int nums[]; // Declaration
        int n = 5;
        nums = new int[n]; // Initialization
        System.out.println(nums.toString()); // hash code
        nums[0] = 5;
        nums[3] = 7;
        System.out.println(nums.toString()); // hash code
    }
}
