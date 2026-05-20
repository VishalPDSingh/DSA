package ch9_String.chp_String;

public class EqualgnoreCaseMethod {
    public static void main(String[] args) {
        
        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
