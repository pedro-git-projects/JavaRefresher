package ch03;

import java.util.Arrays;

public class Code01 {
    // Array
    public static void main(String[] args) {
        // fixed size
        // homogeneous
        // arrays are Objects
        // Important, we can acess array methods via dot notation on the array name, but we can also acess meber methods via indexes

        int size = 3;
        String[] arrayWithoutInitialization = new String[size];
        arrayWithoutInitialization[0] = "Zeroth";
        arrayWithoutInitialization[1] = "Second";
        arrayWithoutInitialization[2] = "Third";

        // This won`t print out the array elements, but it`s memory location
        // In other words, its reference
        System.out.println(arrayWithoutInitialization);

        // To print the elements, one should use:
        System.out.println(Arrays.toString(arrayWithoutInitialization));

        // Traversing an array with a for loop
        for(int i = 0; i < arrayWithoutInitialization.length; i++) {
            System.out.println(arrayWithoutInitialization[i]);
        }

        for(int i = 0; i < 3; i++ ) {
            System.out.println(new StringBuilder(arrayWithoutInitialization[i]).append(" element"));
        }

        // Simultaneously declaring and initializing array

        double[] initializedOnDeclaration = {10.0, 8.5, 8.6,8.4,9.55};

        // getting the sum of all elements on array
        double sum = 0;

        for(int i = 0; i < initializedOnDeclaration.length; i++) {
            System.out.println(initializedOnDeclaration[i]);
            sum += initializedOnDeclaration[i];
        }

        double mean = sum / initializedOnDeclaration.length;
        System.out.printf("My mean this bimester was %.2f", mean);
    }
}
