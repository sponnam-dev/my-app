package com.mycompany.app.stringclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateStrings {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("swapna");
        strList.add("padma");
        strList.add("swapna");
        Map<String, Integer> map = new HashMap<>();
        for(String s : strList){
            if(map.containsKey(s)){
                Integer val = map.get(s);
                map.put(s, val+1);
            } else{
                map.put(s,1);
            }
        }
        List<String> duplicates =map.keySet().stream().filter(s->map.get(s) > 1).collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
