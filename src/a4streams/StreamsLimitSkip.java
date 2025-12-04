package a4streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkip {

    public static Optional<Integer> limit(List<Integer> integerList){
        return integerList.stream()
                //only first 3 numbers of the array are considered when limit is set just like in sql
                .limit(3)
                .reduce((x,y)-> x+y);
    }

    public static Optional<Integer> skip(List<Integer> integerList){
        return integerList.stream()
                //only first 3 numbers of the array are skipped when skip is set to 3 just like in sql
                .skip(3)
                .reduce((x,y)-> x+y);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,9,10);
        Optional<Integer> optional = limit(list);
        optional.ifPresent(System.out::println);
        System.out.println("++++++++");

        Optional<Integer> skipOptional = skip(list);
        skipOptional.ifPresent(System.out::println);
    }
}
