package ch8_Array.Easy;

public class Q12_LargestAltitude {
    static int largestAltitude(int gain[])
    {
        // starting point of biker
        int startPoint = 0;
        int maxHeight = 0;

        for(int i=0; i<gain.length; i++)
        {
            startPoint = startPoint+gain[i];
            if(startPoint > maxHeight)
            {
                maxHeight = startPoint;
            }
        }

        return maxHeight;
    }
    public static void main(String[] args) {
        
        int gain[] = {-7, 5, 4, 3};
        int res = largestAltitude(gain);
        System.out.println(res);
    }
}
