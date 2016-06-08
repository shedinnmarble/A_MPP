package prob4;

import prob3.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format
        list.forEach(new MyCustomer());


    }

    //implement a Consumer
    static class MyCustomer implements Consumer {

        @Override
        public void accept(Object o) {
            System.out.println(o);
        }
    }

}
