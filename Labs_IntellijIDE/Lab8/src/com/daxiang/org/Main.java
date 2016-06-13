package com.daxiang.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Student> honorToll = new ArrayList<>();
        honorToll.add(new Student(4.0, "ComSci"));
        honorToll.add(new Student(4.5, "ComSci"));
        honorToll.add(new Student(4.5, "ComSci"));
        honorToll.add(new Student(2.0, "ComSci"));
        honorToll.add(new Student(3.8, "ComSci"));

//        honorToll = honorToll.stream()
//                .filter(student -> student.getGpa() > 3.0 && student.getMajor().equals("ComSci"))
//                .collect(Collectors.toList());

//       honorToll.stream()
//                .sorted(Comparator.comparing(Student::getGpa).reversed()).forEach(System.out::println);
        System.out.println("Use Comparator");
        honorToll.stream()
                .sorted(Comparator.comparingDouble(s->s.getGpa())).forEach(System.out::println);


        System.out.println("Use defualt sorted");
        honorToll.stream()
                .sorted().forEach(System.out::println);

        System.out.println("Use Collections sort");
        Collections.sort(honorToll,(x,y)->{
            if(x.getGpa()>y.getGpa()) return -1;
            else if(x.getGpa()<y.getGpa()) return 1;
            else return 0;
        });
        honorToll.stream().forEach(System.out::println);

    }
}
