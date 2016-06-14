package Q3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by yafen on 2016/6/13.
 */
public class Main {
    private static Executor executor= Executors.newCachedThreadPool();
    private static Queue queue=new Queue();
    private static int count = 0;
    public static void main(String[]args){
        //mutil thread test
        TestAdd(200);
        //single thread test
        //singleThread(200);
    }

    public static int incrementCount() {
        return count++;
    }
    public static void singleThread(int threadNum){
        for(int i=0;i<threadNum;i++) {
            IntStream.range(1, 1001).forEach(queue::add);

        }
        System.out.println("single thread test queue size"+queue.getSize());
    }
    public static void TestAdd(int threadNum)  {
        Runnable add=()-> {
            IntStream.range(1,1001).forEach(queue::add);
        };
        for(int i=0;i<threadNum;i++){
            executor.execute(add);
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("mutile thread test queue size"+queue.getSize());
    }



}
