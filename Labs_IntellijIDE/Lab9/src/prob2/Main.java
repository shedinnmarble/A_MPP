package prob2;

import java.util.stream.IntStream;

/**
 * Created by yafen on 2016/6/9.
 */
public class Main {
    public static void main(String[] args){
        printSquares(4);
    }
    public static void printSquares(int num){
        IntStream.iterate(1,x->x+1).limit(num).forEach(x->System.out.println(x*x));
    }
}

