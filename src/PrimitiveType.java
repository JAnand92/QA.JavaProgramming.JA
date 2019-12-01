public class PrimitiveType {

    /*Package in java is folder's name which helps to organise the code.
    * Usually, companies use their domain name in reverse order for their package  name.*/
    /*Primitive type - boolean, byte, char, short, int, long, float, and double */

    /*1 byte = 8 bits
    * 1 short = 16 bits
    * 1 int = 32 bits*/

    public static void main(String[] args){
        /*Integer Primitive type...*/
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted Maximum value = " + (myMaxIntValue + 1));
        System.out.println("Busted Minimum value = " + (myMinIntValue - 1));

        /*Byte Primitive type...*/
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        /*Short Primitive type*/
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        /*Long Primitive type...*/
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);

       /*Casting in Java*/
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue =  (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myTotal + " " + myNewByteValue + " " + myNewShortValue);

        /*Primitive type challenge*/
        byte myByteNumber = Byte.MAX_VALUE;
        short myShortNumber = Short.MAX_VALUE;
        int myIntNumber = Integer.MAX_VALUE;

        long myLongValueTotal  = 50000L + 10*(myByteNumber + myShortNumber + myIntNumber);
        System.out.println("My Long value total is = " + myLongValueTotal);

        short myShortTotal = (short) (10 * (myByteNumber + myShortNumber + myIntNumber));
        System.out.println("My Short total = " + myShortTotal);

        /*float and double primitive type...*/
        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + myFloatMinValue);
        System.out.println("Float Maximum value = " + myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = " + myDoubleMinValue);
        System.out.println("Double Maximum value = " + myDoubleMaxValue);

        int myIntValue = 5;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        float myFloatValue1 = (float)5.25;
        float myFloatValue2 = 5.25f;
        System.out.println("Float value1 = " + myFloatValue1 + " Float value2= " + myFloatValue2);

        System.out.println("My Int value = " + myIntValue);
        System.out.println("My Float value = " + myFloatValue);
        System.out.println("My Double value = " + myDoubleValue);

        /* It's good practice to use Double instead Float, Double takes less time to process.
        * Most computer at chip level is designed to process double faster.
        * And, java library is more specific to double instead of float.*/

        /*Double and Float related challenge*/
        double myNumberOfPound = 500d;
        double myConvertedKilogram = myNumberOfPound * 0.45359237d;
        System.out.println("Converted Kilogram = " + myConvertedKilogram);

        /*When precise calculation is needed, float and double both are not at the best.
        * Because, the way they get stored, not a java problem as such.
        * Java has class BigDecimal which is way good for this.
        * But, for general calculation, Double is good among float and double.*/

        /*Char and Boolean Primitive type*/

        char myChar = 'D';
        /*Char is different than StringDataType. Char can store only one character.
        * When you go kind of scenario, where user typed last key in any game.
        * Or, store the last option value from menu.
        * Char takes 2 byte - 16 bits.*/
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        /*boolean can have 2 values either 'true' and 'false'*/
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
    }
}
