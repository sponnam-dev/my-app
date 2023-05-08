package com.mycompany.app.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<>();

        t.put(10,"swapna");
        t.put(9,"padma");
        t.put(12,"abcd");
        System.out.println(t);

    }
}
