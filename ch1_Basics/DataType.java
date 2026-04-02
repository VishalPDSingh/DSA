package ch1_Basics;

public class DataType {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("sum of " + x + " and " + y + " is " + sum);
        int pro = x * y;
        System.out.println("sum of " + x + " and " + y + " is " + pro);

        int div = x / y;
        System.out.println("sum of " + x + " and " + y + " is " + div);
        int div1 = y / x;
        System.out.println("sum of " + x + " and " + y + " is " + div1);

        int mod = x % y;
        System.out.println("sum of " + x + " and " + y + " is " + mod);

        int bod = (x*y)/(x+y);
         System.out.println("sum of "+x+" and "+y+ " is "+bod);
    }
}
