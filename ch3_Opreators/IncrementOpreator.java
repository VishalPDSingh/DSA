package ch3_Opreators;

public class IncrementOpreator {
    public static void main(String[] args) {
        
        // pre-increment
        int x = 10;
        System.out.println(++x); // 11
        int y = x;
        System.out.println(x); //11
        System.out.println(y); //11

        // post- increment
        int a = 15;
        System.out.println(a);// 15
        a++;
        System.out.println(a);// 16
        int b = a++;
        System.out.println(a); //17
        System.out.println(b);//16
    }
}
