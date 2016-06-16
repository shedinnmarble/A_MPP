package com.mum.daxiang.edu;

import org.jetbrains.annotations.Contract;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by 985219 on 6/15/2016.
 */
public class TestSuperClassGeneric {
    public static void main(String[] args) {
        Employee[] arr= new Employee[2];
        arr[0]=new Employee("Dewei");
        arr[1]=new Employee("Awad");
        printAll(arr, o ->o.toString().length()>0);
        List<Employee> employees=new ArrayList<>();
        employees.add(new Manager("Dewei"));
        employees.add(new Manager("Awad"));
        System.out.println( findMax(employees));
        List<LocalDate> dateList=new ArrayList<>();
//        dateList.add( ChronoLocalDate.from(new TemporalAccessor()));
//        dateList.add( ChronoLocalDate.of(2012,1,1));
//        dateList.add( ChronoLocalDate.of(2013,1,1));
        ChronoLocalDate d= findMax(dateList);
        System.out.println(d);
        //test ? extends and ? super

        List<? super Manager> employees1=new ArrayList<>();
        employees1.add(new Manager("d"));
        employees1.add(new Employee("a"));
        employees1.add(new Object());

        List<Employee> employeeList=new ArrayList<>();
        List<Object> objectList=new ArrayList<>();
        employees1=employeeList;
        employees1=objectList;




    }

    public static <T  extends Comparable<? super T >> T findMax(List<T> list){
        if(list==null||list.isEmpty()) return null;
        T max=list.get(0);
        for(T item:list){
            if(item.compareTo(max)>0){
                max=item;
            }
        }
        return max;
    }
    public static void printAll(Employee[] employees, Predicate<? super Employee> filter){
        for(Employee stuff:employees){
            if(filter.test(stuff)){
                System.out.println(stuff.getName());
            }
        }
    }
}
