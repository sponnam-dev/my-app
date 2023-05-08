package com.mycompany.app.java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortStream {
    public static void main(String[] args) {
        //sortStreamAsc();
        sortStreamDESC();
    }

    public static void sortStreamAsc(){
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(5);
        l.add(12);
        List<Integer> li = l.stream().sorted().collect(Collectors.toList());
        System.out.println(li.toString());
    }

    public static void sortStreamDESC(){
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(5);
        l.add(12);
        List<Integer> li = l.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }).collect(Collectors.toList());
        System.out.println(li.toString());

    }
}