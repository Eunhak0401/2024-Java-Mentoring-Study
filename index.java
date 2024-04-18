/*
public class index {
    public static void main(String[] args) {
        boolean booleanValue = true;
        char charValue = 'A';

        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        float floatValue = 30.333F;
        double doubleValue = 99.999;

        System.out.println("charValue :" + charValue);
        System.out.println(Character.SIZE);

        System.out.println("byte :" + byteValue);
        System.out.println(Byte.SIZE);

        System.out.println("int :" + intValue);
        System.out.println(Integer.SIZE);

        System.out.println("longValue :" + longValue);
        System.out.println(Long.SIZE);

        System.out.println("floatValue :" + floatValue);
        System.out.println(Float.SIZE);

        System.out.println("doubleValue :" + doubleValue);
        System.out.println(Double.SIZE);
    }
}


public class index {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = num1;
        double num3 = num1;

        System.out.println("int값 : " + num1);
        System.out.println("형변환 된 long값 :" + num2);
        System.out.println("형변환 된 douvle값 : " + num3);

        double num4 = 3.14;
        int num5 = (int) num4;

        System.out.println("double값 : " + num4);
        System.out.println("형변환 된 int값 : " + num4);
    }
}
 */

class Americano {
    int price = 2000;
    String name = "아메리카노";
}
public class index {
     public static void main(String[] args) {
         Americano americano = new Americano();

         System.out.println(americano.name);
         System.out.println(americano.price);


    }
}