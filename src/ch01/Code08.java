package ch01;

public class Code08 {
    // Wrappers
    public static void main(String[] args) {

        // Creating Strings as regular objects
        String yesStringsAreObjects = new String("This string was created as are other objects");
        System.out.println(yesStringsAreObjects);

        // Wrappers are Object versions of primitive types

        Byte byteObject = 127;
        System.out.println(byteObject.hashCode());

        Short shortObject = 32_767;
        System.out.println(shortObject.shortValue());



        Integer integerObject = 2_147_483_647;
        System.out.println(integerObject.getClass());

        Long longObject = 9_223_372_036_854_755_807L;
        System.out.println(longObject.byteValue());
    }
}
