package ch01;

public class Code06 {
    // Strings
    public static void main(String[] args) {
        String objectString = "Strings are immutable objects";

        // As strings are immutable, we're not MODIFYING the value inside the variable, but REPLACING it
        objectString = objectString.toUpperCase();
        System.out.println(objectString);

        System.out.println(objectString.concat("!!!"));

        // As we didn't reassign the variable, we'll get only 3 !!!
        System.out.println(objectString + "!!!");

        System.out.println(objectString.startsWith("Str"));
        System.out.println(objectString.toLowerCase().startsWith("str"));

        // We MUST use the method equals instead of == in Java to compare String objects
        System.out.println(objectString.equals("Strings are immutable objects"));
        System.out.println(objectString.equalsIgnoreCase("Strings are immutable objects"));

        // Substrings
        System.out.println("Some substring methods".contains("ethods"));
        System.out.println("Some substring methods".indexOf("ethods")); // returns the index of the first letter
        System.out.println("Some substring methods".substring(6, 8)); // lower bound inclusive upper bound exclusive
    }
}
