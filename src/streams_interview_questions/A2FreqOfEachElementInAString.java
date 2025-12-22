package streams_interview_questions;

import java.util.function.Function;
import java.util.stream.Collectors;

public class A2FreqOfEachElementInAString {

    /*   How do you find frequency of each character in a string using Java 8 streams? */
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
       var result = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}
