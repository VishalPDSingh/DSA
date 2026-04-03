package ch3_Opreators;

public class Decrement {
    
    public static void main(String[] args) {
        
         // pre-Decrement
        int x = 10;
        System.out.println(--x); // 9
        int y = x;
        System.out.println(x); //9
        System.out.println(y); //9

        // post- Decrement
        int a = 15;
        System.out.println(a);// 15
        a++;
        System.out.println(a);// 14
        int b = a++;
        System.out.println(a); //13
        System.out.println(b);//14
    }
}
