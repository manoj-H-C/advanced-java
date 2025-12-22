package streams_interview_questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A13ReverseEachWordOfAString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String reverse = Stream.of(str.split(" "))
                .map(s -> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}
