package a2functional_interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator= (a,b)-> a.compareTo(b);

    public static void main(String[] args) {
        /* takes 2 input parameter of same type and returns one output of same type */
        BinaryOperator<Integer> binaryOperator = (a,b)-> a*b;
        System.out.println("result of binary operator " + binaryOperator.apply(3,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(3,4));
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(3,4));
    }
}
