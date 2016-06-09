package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by yafen on 2016/6/8.
 */
public class Main {
    public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> function = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add((x * y));
            return list;
        };
        System.out.println(function.apply(3.0, 4.0));

    }
}
