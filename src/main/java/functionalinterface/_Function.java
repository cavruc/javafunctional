package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(2);
        System.out.println(increment2);

        int myltiply = multiplyBy10
                .apply(increment2);
        System.out.println(myltiply);

        Function<Integer, Integer> addBy1andThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(addBy1andThenMultiplyBy10.apply(2));
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }
     static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementBy, numberToMultiplyBy)
            -> (numberToIncrementBy + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply (int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }


    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 =
            number -> number * 10;

    static int incrementByOne (int number){
        return number + 1;
    }
}
