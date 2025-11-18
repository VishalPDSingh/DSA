package Ch2_Array;

public class Demo1 {
    public static void main(String[] args) {
        int marks1 = 25;
        int marks2 = 85;
        int marks3 = 78;
        int marks4 = 60;
        int marks5 = 75;

        int sum = marks1+marks2+marks3+marks4+marks5;
        System.out.println(sum);

        // Array is collection of data types/Variable
        int marks[] = {25,69,78,23,85};
        int sum1 = 0;
        for(int i = 0; i<marks.length; i++)
        {
             sum1 = marks[i]+sum1;
        }
        System.out.println(sum1);
    }
}
