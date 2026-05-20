package ch9_String.Character;

public class Demo1 {
    public static void main(String[] args) {

        // Char data type
        char ch = 'A';
        char digit = '5';
        char symbol = '#';

        System.out.println(ch);
        System.out.println(digit);
        System.out.println(symbol);

        // type casting 
        //1. char → int (Automatic / Widening)
        char a = 'A';
        int x = a;
        System.out.println(x);
        System.out.println(a);

        char b = 'A';
        System.out.println((int)b);

        // 2. int → char (Explicit Casting)
        int x1 = 65;
        char ch1 = (char)(x1);
        System.out.println(ch1);

        System.out.println((char)97);

        
    }
}
