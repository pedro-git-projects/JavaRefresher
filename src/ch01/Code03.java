package ch01;

public class Code03 {
    // inference
    public static void main(String[] args) {
        // we use the keyword var to indicate we want the compiler to infer the variable type

        // note that we can't get the type of our variable a, since methods are not defined for primitive types
        var a = 4.5;
        System.out.println("The initial value of a is => " + a);

        a = 3.5;
        System.out.printf("A is an ordinary variable, meaning that we can change it's value for another of the same type like any other \n" +
                "So, the new value of a is =>  %f \n", a);

        var b = "Test";
        System.out.println(b.getClass());

        // We can break apart the variable declaration from initialization
        int unitialized;
        unitialized = 3;
        System.out.println(unitialized);

        // However, variables which are inferred must be always be initialized, otherwise, there is nothing to infer the type from
    }
}
