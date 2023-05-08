package com.mycompany.app.collections.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,5,4};
        Set s = new HashSet();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
       System.out.println(s);
    }
}
