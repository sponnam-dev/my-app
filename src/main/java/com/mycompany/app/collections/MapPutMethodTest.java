package com.mycompany.app.collections;

import java.util.HashMap;
import java.util.Map;

public class MapPutMethodTest {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        Integer i =m.put("name",1);
        System.out.println("first "+i);//null bcoz previous obj null
        Integer j =m.put("name",2);
        System.out.println("after "+j);//1 bcoz revious object is 1
    }
}
