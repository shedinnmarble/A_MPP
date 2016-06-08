package com.daxiang.q1;

/**
 * Created by yafen on 2016/6/7.
 */
public interface ClassA {
    default void fuck(){
        System.out.println("fuck");
    }
    static void fucku(){
        System.out.println();
        fucku();
    }
}
