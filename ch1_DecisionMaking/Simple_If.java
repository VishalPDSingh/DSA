package ch1_DecisionMaking;

public class Simple_If {
    public static void main(String[] args) {
        
        // Simple if statements
        int marks = 89;

        if(marks >= 90) // true or false
        {
            System.out.println("Your are topper as you have secured "+marks);
        }
        if(marks > 35 && marks <90)
       {
         System.out.println("Your marks is :"+marks);
       }
       if(marks <35)
       {
        System.out.println("You have scored only "+marks);
       }
    }
}
