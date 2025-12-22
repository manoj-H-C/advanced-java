package streams_interview_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class A19DuplicateCharInAString {
    /* Print duplicate characters in a string? */
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        System.out.println(inputString);
        Set<String> uniqueChars = new HashSet<>();

        Set<String> duplicateChars = Arrays.stream(inputString.split(""))
                .filter(i-> !uniqueChars.add(i)).collect(Collectors.toSet());
        System.out.println(duplicateChars);
    }
}
