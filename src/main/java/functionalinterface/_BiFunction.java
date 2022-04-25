package functionalinterface;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {

        // BiFunction takes 2 arguments and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 100)
        );

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
