package ch2_Looping;

public class Q2_EvenNumber_1To_100 {
    public static void main(String[] args) {
        
        for(int i=1; i<=100; i++)
        {
            if(i%2 == 0)
            {
                System.out.println("Number is Even: "+i);
            }
        }
    }
}
