package prob1J;

import sun.security.pkcs11.Secmod;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by yafen on 2016/6/8.
 */
public class Main {
    public static void main(String[] args) {
        //lambda
        Supplier<Double> d1 = () -> Math.random();
        System.out.println(d1.get());
        //method reference
        Supplier<Double> x = Math::random;
        System.out.println(x.get());

        System.out.println(new MySupplier().get());

    }

    /**
     * implements Supplier class
     */
    static class MySupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
