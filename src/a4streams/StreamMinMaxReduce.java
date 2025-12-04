package a4streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxReduce {

    public static Optional<Integer> findMaxValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y)-> (x>y) ? x : y);
    }


    public static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y)-> (x<y) ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,9,10);
        Optional<Integer> result = findMaxValue(list);
        result.ifPresent(System.out::println);
        System.out.println("++++++++++++");
        Optional<Integer> result1 = findMinValue(list);
        result1.ifPresent(System.out::println);
    }
}
