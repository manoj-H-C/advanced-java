package streams_interview_questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A8SumOfAllDigits {
    /* Find sum of all digits of a number in Java 8? */
    public static void main(String[] args) {
        int i=15623;
        Integer sumOfInteger = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfInteger);
    }
}
