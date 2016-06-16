package Q3;

import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by yafen on 2016/6/14.
 */
public class Q3 {
    public static void count(Collection<? super Integer> ints, int n) {
        for(int i = 0; i < n; ++i) {
            ints.add(i);
        }
    }
    public static void main(String[] args) {
        List<Integer> ints=new ArrayList<>();
        ints.add(1);
//        List<? extends Number> nums=ints;
        double sum=sum(ints);
        System.out.println("Integer"+sum);
       // nums.add(3.15);
        List<Number> nums=new ArrayList<>() ;
        count(nums,100);
        System.out.println("Number"+sum(nums));
        List<? super Integer> test = new ArrayList<>();
        test.add(12);
        count(test,100);
       //System.out.println("Super Integer"+sum(test));

    }
    public static double sum(Collection<?extends Number> nums){
        double s=0.0;
        for(Number num:nums){
            s+=num.doubleValue();
        }
        return s;
    }
}
