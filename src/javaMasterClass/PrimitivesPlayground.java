package javaMasterClass;

public class PrimitivesPlayground {

    public static void main(String[] args) {


        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte Value range: " + minByte + " to " + maxByte);
        System.out.println("Byte Width in bits: " + Byte.SIZE);
        System.out.println("-------------------------------------------");


        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short Value range: " + minShort + " to " + maxShort);
        System.out.println("Short Width in bits: " + Short.SIZE);
        System.out.println("-------------------------------------------");

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer Value range: " + minInt + " to " + maxInt);
        System.out.println("Integer Width in bits: " + Integer.SIZE);
        System.out.println("-------------------------------------------");

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long Value range: " + minLong + " to " + maxLong);
        System.out.println("Long Width in bits: " + Long.SIZE);
        System.out.println("-------------------------------------------");

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float Value range: " + minFloat + " to " + maxFloat);
        System.out.println("Float Width in bits: " + Float.SIZE);
        System.out.println("-------------------------------------------");

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double Value range: " + minDouble + " to " + maxDouble);
        System.out.println("Double Width in bits: " + Double.SIZE);
        System.out.println("-------------------------------------------");

        // Char
        System.out.println("Char Width in bits: " + Character.SIZE);
        System.out.println("-------------------------------------------");

        // Boolean
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;


        // Exercises
        System.out.println("\nPrimitive Types challenge");
        System.out.println("-------------------------------------------");
        byte testByte = 105;
        short testShort = 32700;
        int testInt = 100_000;
        long testLong = 50_000L + 10L * (testByte + testShort + testInt);
        System.out.println(testLong);
        System.out.println(testByte + testShort + testInt);
        System.out.println(10 * (testByte + testShort + testInt));

        // Because Java defaults to double, a cast or f suffix is needed to not cause a type error
        float exampleFloat = (float) 5.25;
        System.out.println(exampleFloat);

        System.out.println("\nConvertion of Kg to lbs challenge");
        System.out.println("-------------------------------------------");

        double givenLbs, expectedKgs;

        givenLbs = 7;
        expectedKgs = givenLbs * 0.45359237;

        System.out.println("Result: " + givenLbs + "lbs converted to kg = " + expectedKgs + "kg");

//        float floatNumber = 5.25;
        double doubleNumber = 5.25;
        float newFloat = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println(newFloat);

        float floatAddition = 0.1f + 0.2f;
        double doubleAddition = 0.1 + 0.2;
        System.out.println(floatAddition);
        System.out.println(doubleAddition);

        short myShort = 32767;
        short castShort = (short) (myShort / 2);
        System.out.println(castShort);

        char mySimpleChar, myUniCodeChar, myDecimalChar;
        mySimpleChar = '?';
        myUniCodeChar = '\u003F';
        myDecimalChar = 63;
        System.out.println("mySimpleChar = " + mySimpleChar + "\nmyUnicodeChar = " + myUniCodeChar + "\nmyDecimalChar = " + myDecimalChar);

    }
}
