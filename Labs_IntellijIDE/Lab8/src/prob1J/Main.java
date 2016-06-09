package prob1J;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by yafen on 2016/6/8.
 */
public class Main {
    public static void main(String[] args){
        Supplier<Double> x=Math::random;
        System.out.println(x.get());
        Consumer<String> sc=new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };
        class MyBiFunction implements BiFunction<Integer,
                        Integer, Integer>{

            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return null;
            }
        }


    }
}
