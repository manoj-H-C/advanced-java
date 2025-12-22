package streams_interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A25JoinStringWithPrefix {
    /* Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter? */
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);
    }
}
