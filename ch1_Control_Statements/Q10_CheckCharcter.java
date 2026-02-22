package ch1_Control_Statements;

import java.util.Scanner;

public class Q10_CheckCharcter {
    public static void checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper Case");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        checkCharacter(ch);

        sc.close();
    }
}
