package a3methodreferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    public static void main(String[] args) {
        Function<String,String> fun1 = (s)-> s.toUpperCase();
        System.out.println(fun1.apply("java8"));
        /* className::methodName */
        Function<String, String> fun2 = String::toUpperCase;
        System.out.println(fun2.apply("java20"));
    }
}
