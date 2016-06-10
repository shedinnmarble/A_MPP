package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by 985219 on 6/9/2016.
 */
public class Test {
    public static void main(String[] args){
       // DoubleStream intStream= DoubleStream.generate(Math::random).limit(10);
       // intStream.forEach(x->System.out.println(x));

//        int[] intArr={1,2,3,4,5};
//        IntStream intStream=IntStream.of(intArr);
//
//
//        printSquares(5);
        List<String> strings= Arrays.asList("qqq","sdsfd");
        String[] ss=strings.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(ss));


    }
    public static void printSquares(int limit){
       IntStream nums=IntStream.iterate(1,n->n+1).limit(limit).map(n->n*n);
        nums.forEach(System.out::println);


    }


}
