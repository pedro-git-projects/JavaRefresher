package ch01;

public class Code09 {
    // Casting
    public static void main(String[] args) {

        // Implicit casting takes place when we can't have data loss

        double implicitCasting = 1;
        System.out.println(implicitCasting);

        // Literal values with '.' are double by default, to declare them as floats we would usually make use of F
        // float explicitCasting = 1.0;
        // However we can also cast the value, as seen below

        float explicitCasting = (float) 1.0;
        // Even tough there was no data loss, there COULD be, involving this types, this is why we cast it explicitly
        System.out.println(explicitCasting);

        float floatDataLoss = (float) 1.123456789123456;
        System.out.println(floatDataLoss);

        int smallInt = 4;
        // byte byteCasting = smallInt;
        // this will error out, because again, WE COULD LOSE DATA
        byte byteCasting = (byte) smallInt;
        System.out.println(byteCasting);

        // Casting loops when overflown, be careful
        int intToOverflowByte = 128;
        byte byteOverflow = (byte) intToOverflowByte;
        System.out.println(byteOverflow);

        // Beware that casting does not round the number
        double closeToThree = 2.99999;
        int noRoundingWhenCasting = (int) closeToThree;
        System.out.println(noRoundingWhenCasting);

    }
}
