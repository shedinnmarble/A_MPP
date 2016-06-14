package Q1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 985219 on 6/14/2016.
 */
public class Q1 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends  Number> nums = ints;
        //nums.add(33);
    }
}
