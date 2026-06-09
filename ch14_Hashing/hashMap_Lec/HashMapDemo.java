package ch14_Hashing.hashMap_Lec;

public class HashMapDemo {
    public static void main(String[] args) {
        // hash code
        String name = "Visalh";
        String naam = "Vishal";
        System.out.println(name);
        System.out.println(naam);
        int codeName = name.hashCode();
        int codeNaam = naam.hashCode();
        System.out.println(codeNaam);
        System.out.println(codeName);// both have same hashcode

       Integer i = 466543;
       System.out.println(i.hashCode());
    }
}
