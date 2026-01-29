package ch1_DecisionMaking;

public class If_else_If_Ladder {
    public static void main(String[] args) {
        
         int marks = 33;

        if(marks >= 90) // true or false
        {
            System.out.println("Your are topper as you have secured "+marks);
        }
        else if(marks > 35 && marks <90)
       {
         System.out.println("Your marks is :"+marks);
       }
       else
       {
        System.out.println("You have scored only "+marks+ " need to impoved");
       }
    }
}
