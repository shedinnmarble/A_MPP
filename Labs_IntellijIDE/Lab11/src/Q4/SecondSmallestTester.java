package Q4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by 985219 on 6/14/2016.
 */
public class SecondSmallestTester {
    @Test
    public void runSecondSmallest(){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(11);
        list.add(2);
        list.add(1);
        assertTrue("should return true",1==SecondSmallest.secondSmallest1(list));

    }

}
