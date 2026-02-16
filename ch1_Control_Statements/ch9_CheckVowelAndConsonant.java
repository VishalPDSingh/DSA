package ch1_Control_Statements;

import java.util.Scanner;

public class ch9_CheckVowelAndConsonant {

    public static void checkAlphabet(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Alpabet is vowel: " + ch);
        } else if (ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U') {
            System.out.println("Alpabet is vowle: " + ch);
        } else {
            System.out.println("Consonent");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char ch = sc.next().charAt(0);
        checkAlphabet(ch);
        sc.close();

    }
}
