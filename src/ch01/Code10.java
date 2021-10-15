package ch01;

import javax.swing.*;
import java.util.Scanner;

public class Code10 {
    // String <==> Number
    public static void main(String[] args) {
        // number ==> String

        // Wrapper
        Integer smallestEightTimeAppearanceOnPascalTriangle = 3003;
        System.out.println(smallestEightTimeAppearanceOnPascalTriangle.toString().length());

        // Primitive
        int aToThePowerOfBEqualsToBToThePowerOfA = 16;
        System.out.println(Integer.toString(aToThePowerOfBEqualsToBToThePowerOfA).substring(1));

        // number <== String

        String firstStringToNumber = JOptionPane.showInputDialog("Enter the first number");
        String secondStringToNumber = JOptionPane.showInputDialog("Enter the second number");

        // Note that here it will CONCATENATE not return the sum
        System.out.println("Before parseDouble " + firstStringToNumber + secondStringToNumber);

        double firstStringIsNowANumber = Double.parseDouble(firstStringToNumber);
        double secondStringIsNowANumber = Double.parseDouble(secondStringToNumber);

        double sum =  firstStringIsNowANumber +  secondStringIsNowANumber;
        System.out.println("After parseDobule " + sum);

        // Challenge
        // Use the Scanner, read Strings convert them to numbers and return the mean even if the Strings used , instead of .

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first wage: ");
        String wage1 = in.nextLine();

        System.out.println("Enter the second wage: ");
        String wage2 = in.nextLine();

        System.out.println("Enter the third wage: ");
        String wage3 = in.nextLine();

        String wage1Replacement = "";
        if(wage1.contains(",")) {
            wage1Replacement = wage1.replaceAll(",",".");
        }

        String wage2Replacement = "";
        if(wage2.contains(",")) {
            wage2Replacement =  wage2.replaceAll(",",".");
        }

        String wage3Replacement = "";
        if(wage3.contains(",")) {
            wage3Replacement = wage3.replaceAll(",",".");
        }

        double wage1Double = Double.parseDouble(wage1Replacement);
        double wage2Double = Double.parseDouble(wage2Replacement);
        double wage3Double = Double.parseDouble(wage3Replacement);

        double wagesMean = (wage1Double + wage2Double + wage3Double)/3;

        System.out.println(wagesMean);

        in.close();
    }
}
