package ch02;

import java.util.Scanner;

public class Code01 {
    // If
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the mean: ");
        double mean = in.nextDouble();

        if(mean >= 9) {
            System.out.println("SS");
        } else if (mean >= 8) {
            System.out.println("MS");
        } else if (mean >= 6) {
            System.out.println("MM");
        } else if (mean >= 5) {
            System.out.println("MI");
        } else {
            System.out.println("II");
        }

        in.close();
    }
}
