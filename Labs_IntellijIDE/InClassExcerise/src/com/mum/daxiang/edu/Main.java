package com.mum.daxiang.edu;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // Main m=new Main();
        String[] arr=new String[]{"1","2"};
        System.out.println(countOccurrents(arr,"2"));
        System.out.println(countOccurrents2(arr,"2"));

    }
    public static <T>  int countOccurrents(T[] arr,T target){
        int count=0;
        if(target==null){
            for(T item:arr){
                if(item==null)
                    count++;
            }
        }else{
            for(T item:arr){
                if(target.equals(item)){
                    count++;
                }
            }
        }
        return count;
    }
    public static <T>  int countOccurrents2(T[] arr,T target){
        return (int)Stream.of(arr).filter(x->{
            if(target==null)
                return x==target;
            return x.equals(target);
        }).count();
    }
}
