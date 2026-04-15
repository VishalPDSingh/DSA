package ch11_Recursion;

public class Demo1 {
    static int add(int a, int b)
    {
        return a+b;
    }
     static int mult(int a, int b)
    {
        return a*b;
    }
     static int sub(int a, int b)
    {
        return a-b;
    }
    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;

        int temp1 = add(x, y);
        int temp2 = mult(30, temp1);
        int temp3 = sub(temp2, 75);
        System.out.println(temp3);
    }
}
