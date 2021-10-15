package ch02;

public class Code02 {
    // While
    public static void main(String[] args) {
        System.out.println("Counting form 0 to 9");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("Incrementing on even numbers");
        int j = 0;
        while (j < 20) {
            System.out.println(j);
            j+=2;
        }
    }
}
