package functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    /* predicate takes 1 i/p parameter and returns a boolean values */
    public static void main(String[] args) {
        Predicate<Integer> p = (i) -> {return i%2==0;};
        System.out.println(p.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    static Predicate<Integer> p1 = (i) -> i%2==0;
    static Predicate<Integer> p2 = (i) -> i%5==0;

    public static void predicateAnd(){
        System.out.println("inside predicateAnd method, predicate AND result is");
        System.out.println(p1.and(p2).test(10));
        System.out.println(p1.and(p2).test(9));
        /* if 10 is divisible by both 2 and 10 it returns true */
    }

    public static void predicateOr(){
        System.out.println("inside predicateAnd method, predicate OR result is");
        System.out.println(p1.or(p2).test(10));
        System.out.println(p1.or(p2).test(6));
        /* if the number is divisible by one number it returns true */
    }

    //negate() will reverse the result
    // if true it turns to false and vice versa
    // it is used along with and or methods
    public static void predicateNegate(){
        System.out.println("inside predicateNegate method, predicate NEGATE result is");
        System.out.println(p1.and(p2).negate().test(10));
        System.out.println(p1.or(p2).negate().test(7));
    }
}
