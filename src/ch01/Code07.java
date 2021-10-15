package ch01;

import java.util.Scanner;

public class Code07 {
    // Console
    public static void main(String[] args) {

        // System.in will read from the keyboard
        // We create a variable in of the type Scanner and construct it with new passing System.in as a parameter

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();  // will read until the delimiter \r

        System.out.println("Enter your surname");
        String surname = in.next();  // will read until the delimiter \s

        System.out.println(name + " " + surname);

        // Scanners are not automatically garbage collected, that means that forgetting to close a Scanner will result in a memory leak

        in.close();
    }
}
