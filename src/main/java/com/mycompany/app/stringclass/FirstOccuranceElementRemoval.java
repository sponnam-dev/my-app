package com.mycompany.app.stringclass;

import java.util.ArrayList;
import java.util.List;

public class FirstOccuranceElementRemoval {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String st = "pswapnamap";//swpnamap
        char ch []=st.toCharArray();
        List<String> l = new ArrayList<>();
        int[] arr = new int[ch.length];
        for(int i=0;i< ch.length;i++){
            String str = ""+ch[i];
            if(l.contains(str)){
                int index =l.indexOf(str);
                arr[i]=index;
            }
            l.add(str);
        }
        for(int j=0; j<arr.length;j++){
            l.set(arr[j],"");
        }
        System.out.println(String.join("",l));
    }
}
