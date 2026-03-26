package Recursion;

public class TimeCom1 {
    static int rec1(int n)
    {
        if(n<=1)
            return 1;
        else
            return(rec1(n-1)+n);
    }
    public static void main(String[] args) {
        
        int x = rec1(2);
        System.out.println(x);
    }
}
