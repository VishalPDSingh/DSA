package ch3_Opreators;

public class AssignmentOperator {
    public static void main(String[] args) {
        
        int a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);

       
        int x = 10;
        int y = 20;
         // Addition Assignment
         System.out.println(x+=y); // 30
         System.out.println(x-=y); // 10
         System.out.println(x*=y); // 200
         System.out.println(x/=y); // 0
         System.out.println(x%=y); // 1
         System.out.println(10/20); // 0
         System.out.println(10%20); // 1
    }
}
