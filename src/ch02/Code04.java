package ch02;

public class Code04 {
    //For
    public static void main(String[] args) {
        // counter  condition   increment
        for(int counter = 0; counter <= 20; counter +=2) {
            System.out.printf("i = %d\n", counter);
        }

        // Decrementing
        for (int counter2 = 10; counter2 >= 0; counter2 -= 2){
            System.out.printf("counter = %d \n", counter2);
        }

        // Nested
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("[%d %d] \n", i, j);
            }
        }
    }
}
