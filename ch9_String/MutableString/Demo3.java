package ch9_String.MutableString;

import java.util.StringTokenizer;

public class Demo3 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("JAVA PYTHON SQL AI", "A");

        while (st.hasMoreTokens() == true) {
            System.out.println(st.nextToken());
        }

    }
}
