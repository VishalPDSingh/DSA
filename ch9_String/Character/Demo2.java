package ch9_String.Character;

public class Demo2 {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch + 1);

        for (int i = 'a'; i < 'f'; i++) {
            System.out.println(i);
        }
        for (char i = 'a'; i < 'f'; i++) {
            System.out.println(i);
        }

        char ch1 = 'a';

        System.out.println(ch1); // a
        System.out.println(ch1 + 1); // 98
        System.out.println((char) (ch + 1)); // b

        char ch2 = '₹';

        System.out.println((int) ch2);
    }
}
