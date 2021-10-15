package ch01;

public class Code02 {
    // We'll explore the basic usage of variables and constants
    public static void main(String[] args) {
        // type name = value
        int radius = 3;
        // the keyword final turns a variable into a constant, constants are named using all caps
        final double PI = 3.14159;

        double area = PI * radius * radius;

        System.out.println(area);

        // printf is another method to print String objetcs we use the % operator for formatting
        System.out.printf("The area is %.2f m2", area);

        //note that printf doesn't feed in a new line, to do that we would use an escape character \n
        System.out.print("\n");

        // We can also concatenate using the println method
        // Note that we have also applied a method directly to the variable area in the moment of printing
        System.out.println("Another way to print the area, which is " + Math.round(area) + "m2");
    }
}

