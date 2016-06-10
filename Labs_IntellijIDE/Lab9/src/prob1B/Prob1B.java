package prob1B;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yafen on 2016/6/9.
 */
public class Prob1B {
    public static void main(String[] args){
        Stream<String> stringStream=Arrays.asList("Bill","Thomas","Mary").stream();
       System.out.println(stringStream.collect(Collectors.joining(",")));
    }
}
