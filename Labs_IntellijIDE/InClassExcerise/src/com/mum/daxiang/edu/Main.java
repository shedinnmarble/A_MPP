package com.mum.daxiang.edu;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // Main m=new Main();
        String[] arr=new String[]{"1","2"};
        System.out.println(countOccurrents(arr,"2"));
        System.out.println(countOccurrents2(arr,"2"));
    //test 2
        ArrayList<Manager> bosses = new ArrayList<>();
        //ArrayList<Employee> empls=bosses;
        ArrayList<? super Manager> managerList=new ArrayList<Manager>();
        managerList.add(new Manager("Dewei",1));
        managerList.add(new Manager("Dewei",1));

        ArrayList<? super Manager> employeeList=new ArrayList<Employee>();
        //employeeList.add(new Manager());

        //Producer extends, Consumer Super
        //you can't add anything to ? extends T type,
        // but you can only write T to ?super T

        List<? extends Number> foo3 = new ArrayList<Number>();
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        foo3=integerList;
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
        return (int) Stream.of(arr).filter(x->{
            if(target==null)
                return x==target;
            return x.equals(target);
        }).count();
    }
}
