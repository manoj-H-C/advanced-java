package a2functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("password"));
    }

    /* takes one input parameter and returns an output of same type */

    static UnaryOperator<String> unaryOperator = (s)-> s.concat("default");
}
