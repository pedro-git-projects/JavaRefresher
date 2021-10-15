package ch01;

// This comment is inside the package and outside tha class
// Importing Date
import java.util.Date;

public class Code05 {
    // Imports
    public static void main(String[] args) {
        String noImport = "There is no need to import some basic methods";

        System.out.println(noImport);

        // to use Date we need to explicitly import Date
        Date importNeeded = new Date();
        System.out.println(importNeeded);
    }

}
