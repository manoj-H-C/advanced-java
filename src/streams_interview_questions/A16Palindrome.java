package streams_interview_questions;

import java.util.stream.IntStream;

public class A16Palindrome {
    /* Palindrome program using Java 8 streams */
    public static void main(String[] args) {
        String str = "ROTATOR";
       boolean isItPalindrome = IntStream.range(0,str.length()).allMatch(i-> str.charAt(i) == str.charAt(str.length()-i-1));
        if (isItPalindrome)
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
    }
}
