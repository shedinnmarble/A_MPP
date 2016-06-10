package prob4;

import java.util.*;

/**
 * Created by yafen on 2016/6/9.
 */
public class Unionset {
    public static void main(String[] args) {
        List<Set<String>> lists=new ArrayList<>();
        Set<String> s1=new HashSet<String>(Arrays.asList(new String[]{"A","B"}));
        Set<String> s2=new HashSet<String>(Arrays.asList(new String[]{"D"}));
        Set<String> s3=new HashSet<String>(Arrays.asList(new String[]{"1","2"}));
        lists.add(s1);
        lists.add(s2);
        lists.add(s3);
        union(lists).stream().sorted().forEach(System.out::println);

    }


    public static Set<String> union(List<Set<String>> sets) {

        return sets.stream().reduce((x, y) -> {
            x.addAll(y);
            return x;
        }).get();
    }
}
