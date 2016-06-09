package prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by yafen on 2016/6/8.
 */
public class Main {
    public static void main(String[] args){
        List<String> words=new ArrayList<String>();
        words.addAll(Arrays.asList("qwer","quer","werf"));
        System.out.println(new Main().countWords(words,'w','u',4));
    }

    /**
     *
     * @param words
     * @param c contain c
     * @param d not contain d
     * @param len words length
     * @return matched strings
     */
    public int countWords(List<String> words, char c, char d, int len){
        return (int)words.parallelStream().filter(w->
          w.length()==len&&w.contains(c+"")&&!w.contains(d+"")
        ).count();
    }
}
