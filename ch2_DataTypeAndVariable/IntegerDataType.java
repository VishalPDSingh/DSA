package ch2_DataTypeAndVariable;

public class IntegerDataType {
    public static void main(String[] args) {
        
        // Byte Data Type
        // maximum value and Min Value 
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("size in bits: "+Byte.BYTES);

        byte b = 125;
        System.out.println(b);
        System.out.println("-------------------------------");

        // short
        // maxvalue and min value 
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        Short s = 459;
        System.out.println(s);
         System.out.println("-------------------------------");
        // Integer
        // maxValue and MinValue
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int i = 14569;
        System.out.println(i);
        System.out.println("---------------------------------");

        // long 
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        long l = 145697569l;
        System.out.println(l);
    }
}
