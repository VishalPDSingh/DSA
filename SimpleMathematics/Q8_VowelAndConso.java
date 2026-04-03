package SimpleMathematics;

import java.util.Scanner;

public class Q8_VowelAndConso {

    static void vowelconsonant(char ch) {

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                System.out.println("Vowel");

            } else {
                System.out.println("Consonant");
            }

        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        vowelconsonant(ch);
        sc.close();
    }
}