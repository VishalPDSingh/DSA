package ch3_Opreators;

public class LogicalOperator {
    public static void main(String[] args) {
        
        int a = 20;
        int b = 30;
       System.out.println(a>b && b>a); // f
       System.out.println(a>b || b>a); // t
       System.out.println(!(b>a)); // f
    }
}
