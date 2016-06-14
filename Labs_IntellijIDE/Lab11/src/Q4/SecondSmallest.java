package Q4;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 985219 on 6/14/2016.
 */
public class SecondSmallest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
//        list.add(11);
//        list.add(2);
//        list.add(1);
        System.out.println(secondSmallest1(list
        ));

//        List<String> list1=new ArrayList<>();
//        list1.add("0");
//        list1.add("111");
//        list1.add("2");
//        list1.add("2");
//        System.out.println(secondSmallest(list1
//        ));

    }

    public static int secondSmallest(List<Integer> list) throws Exception {
        if(list.size()<2){
            throw new IllegalArgumentException("List should Contain two item");
        }
        int firstSmall = list.get(0);//1
        int secondSmall = list.get(1);//2
        if (firstSmall > secondSmall) {
            int temp = firstSmall;
            firstSmall = secondSmall;
            secondSmall = temp;
        }
        for (int i = 2; i < list.size(); i++) {
            int next = list.get(i);
            if (next < firstSmall) {
                secondSmall = firstSmall;
                firstSmall = next;
            } else if (next < secondSmall) {
                secondSmall = next;
            }
        }
        return secondSmall;

    }

    public static <T extends Comparable> T secondSmallest1(List<T> list) {
        if(list.size()<2){
            throw new IllegalArgumentException("List should Contain two item");
        }
        T smallest = list.get(0);//1
        T secondSmallest = list.get(1);//2
        if (smallest.compareTo(secondSmallest) > 0) {
            T temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }
        for(int i=2;i<list.size();i++){
            T next=list.get(i);
            if(next.compareTo(smallest)<0){
                secondSmallest=smallest;
                smallest=next;
            }else if(next.compareTo(secondSmallest)<0){
                secondSmallest=next;
            }
        }

        return secondSmallest;
    }
}
