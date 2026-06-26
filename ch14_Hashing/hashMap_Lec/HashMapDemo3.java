package ch14_Hashing.hashMap_Lec;
import java.util.HashMap;

public class HashMapDemo3 {
    public static void main(String[] args) {
        
        HashMap<Integer,Integer> collegeRankingMap1 = new HashMap<>();

        collegeRankingMap1.put(111, 1);
        collegeRankingMap1.put(312, 2);
        collegeRankingMap1.put(457, 3);
        System.out.println(collegeRankingMap1.get(111));
       
        HashMap<MyCollege,MyRanking> collegeRankingMap2 = new HashMap<>();

        collegeRankingMap2.put(new MyCollege(111), new MyRanking(1));
        collegeRankingMap2.put(new MyCollege(312), new MyRanking(2));
        collegeRankingMap2.put(new MyCollege(457), new MyRanking(3));
        System.out.println(collegeRankingMap2.get(new MyCollege(111)));

    }
}

class MyCollege
{
    int regNo;
    MyCollege(int regNo)
    {
        this.regNo = regNo;
    }
   
}

class MyRanking
{
    int rank;
    MyRanking(int rank)
    {
        this.rank = rank;
    }
}
