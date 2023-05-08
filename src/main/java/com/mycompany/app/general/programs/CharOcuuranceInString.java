package com.mycompany.app.general.programs;

import java.util.HashMap;

public class CharOcuuranceInString {
    public static void main(String[] args) {
        String str = "This is my program";
        String str2 = str.replaceAll("\\s","");
        System.out.println(str2);
        char[] ch = str2.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0; i< ch.length; i++){
            Character cht = new Character(ch[i]);
            // int count =0;
            if(!map.containsKey(cht)){
                map.put(cht, 1);
            } else{
                //already exist
                Integer countV= map.get(cht);
                map.put(cht, countV+1);
            }

        }
        System.out.println(map);
    }
}
