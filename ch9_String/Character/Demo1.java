package ch9_String.Character;

public class Demo1 {
    public static void main(String[] args) {

        // Syntax:
        char ch = 'A';
        System.out.println(ch);

        // Rule of character DataType

        // we can perform any mathematical opration on character
        System.out.println('A' + 'B');

        // TypeCasting
        // char into int : implicit
        int x = 'a';
        System.out.println(x);
        x = 'c';
        x = x + 2;
        System.out.println(x);

        // int to char: Complicated
        char ch1 = 66;
        System.out.println((char) ch1);

        char ch2 = 'A';
        ch2 = ch2 + 3; // error
        System.out.println(ch2);
    }
}
