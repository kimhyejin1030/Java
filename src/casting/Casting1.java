package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longvalue = " + longValue); // longValue = 10

        doubleValue = intValue;
        System.out.println("doublevalue = " + doubleValue); // doubleValue = 10.0

        doubleValue = 20L;
        System.out.println("doublevalue2 = " + doubleValue); // doubleValue2 = 20.0
    }
}
