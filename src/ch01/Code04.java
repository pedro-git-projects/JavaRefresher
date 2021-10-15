package ch01;

public class Code04 {
    // Primitive types
    public static void main(String[] args) {
        /*
            Diferently from other languages which compile directly to machine instructions,
            as Java compiles to bytecodes to be read from JVM its primitive types don't vary in value
            according to the target architecture.
         */

        // Integers

        // 1 byte
        byte maxByte = 127;
        byte minByte = -128;

        // 2 bytes
        short maxShort = 32_767;
        short minShort = -32_768;

        // 4 bytes
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        // 8 bytes
        // if the letter L is not passed, the compiler won't read it as a Long literal, erroring out
        long maxLong = 9_223_372_036_854_755_807L;
        long minLong = -9_223_372_036_854_755_808L;

        // Real numbers

        // 4 bytes
        // note that just like with longs, we need to pass F
        float maxFloat = 3.40282347E+38F;
        float minFloat = -3.40282347E+38F;

        // 8 bytes
        double maxDouble = 1.79769313486231570E+308;
        double minDouble = -1.79769313486231570E+308;

        // Boolean

        boolean notFalse = true;
        boolean notTrue = false;

        // Characters
        char literalCharacter = 'a';
        char unicodeValue = '\u0026';

        System.out.printf("Decimal integers: \n " +
                "from %d to  %d \n  " +
                "from %d to %d \n " +
                "from %d to %d \n " +
                "from %d to %d \n", minByte, maxByte, minShort, maxShort, minInt, maxInt, minLong, maxLong);

        System.out.printf("Floating point numbers: \n " +
                "from %f to %f \n" +
                "from %f to %f \n", minFloat, maxFloat, minDouble, maxDouble);

        System.out.printf("Boolean values are %b and %b", notFalse, notTrue);

        System.out.printf("Printing the literal character passed as 'a' => %c printing the unicode character passed as '\\u0026' => %c", literalCharacter, unicodeValue);
    }
}
