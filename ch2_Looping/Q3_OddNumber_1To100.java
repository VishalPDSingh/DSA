package ch2_Looping;

public class Q3_OddNumber_1To100 {
    public static void main(String[] args) {
        
        for(int i=1; i<=100; i++)
        {
            if(i%3 == 0)
            {
                System.out.println("Odd number is "+i);
            }
        }
    }
}
