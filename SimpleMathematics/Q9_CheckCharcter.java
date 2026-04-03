package SimpleMathematics;

import java.util.Scanner;

public class Q9_CheckCharcter {
    static void characterCheck(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the charcter: ");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        characterCheck(ch);

        sc.close();
    }
}
