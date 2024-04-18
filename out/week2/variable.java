public class variable {

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
