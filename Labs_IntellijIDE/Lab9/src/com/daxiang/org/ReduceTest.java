package com.daxiang.org;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by 985219 on 6/10/2016.
 */
public class ReduceTest {
    public static void main(String[] args){
        Stream<Integer> integerStream=Stream.of(1,2,4);
//        Optional<Integer> difference=integerStream.reduce((a, b)->a+b);
//        System.out.print(difference.orElse(000));

        integerStream.toArray();


    }
}
