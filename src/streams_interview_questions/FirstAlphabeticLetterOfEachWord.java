package streams_interview_questions;

import java.util.stream.Stream;

public class FirstAlphabeticLetterOfEachWord {
    public static void main(String[] args) {
        String statement = "This is my <oditas interview no 1";

        Stream.of(statement.split(" "))
                .map(word -> word.chars()
                        .filter(Character::isLetter)
                        .findFirst())
                .forEach(ch -> {
                    ch.ifPresent(c -> System.out.println((char) c));
                });
    }

}
