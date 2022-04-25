package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println("increment = " + increment);

        int increment1 = incrementByOneFunction.apply(1);
        System.out.println("increment1 = " + increment1);

        int multiply = multipleBy10Function.apply(increment1);
        System.out.println("multiply = " + multiply);

        // combine functions
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));
    }

    // <input, output>
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function = number -> number *10;

    static int increment(int number){
        return number += 1;
    }
}
