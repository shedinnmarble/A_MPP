package com.daxiang.org;

import java.util.Comparator;

/**
 * Created by 985219 on 6/11/2016.
 */
public class Student implements Comparator<Student> {
  private double gpa;

    public Student(double gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return this.getGpa()+this.major;
    }

    private String major;


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGpa()>o2.getGpa()) return -1;
        if(o1.getGpa()<o2.getGpa()) return 1;
        return 0;
    }
}
