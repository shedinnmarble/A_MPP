package prob1A;

import java.util.stream.IntStream;

/**
 * Created by yafen on 2016/6/9.
 */
public class Main {
    public static void main(String[] args) {
//        IntStream ones = IntStream.generate(() -> 1).distinct();
        IntStream ones = IntStream.generate(() -> 1).limit(1);
        ones.forEach(System.out::println);
    }

}
