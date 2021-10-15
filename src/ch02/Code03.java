package ch02;

import java.util.Scanner;

public class Code03 {
    // While 2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type something to begin");

        while(!in.nextLine().equalsIgnoreCase("exit")) {
            System.out.println("Type anything but 'exit' to continue. ");
        }
        in.close();
    }
}
