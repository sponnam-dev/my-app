package com.mycompany.app.collections.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveSameElementsToEnd {
    public static void main(String[] args) {

      /*  for(int i =0 ; i<arr.length;i++){
            if(arr[i]== 0){
               int j=i+1;
                if(j<arr.length && arr[j] != 0){
                    int temp = arr[j];
                    System.out.println("temp "+temp);
                    arr[j]=arr[i];
                    arr[i] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);*/

        //
        int arr[] = {2,4,0,1,0,-1,6,0,};
        List<Integer> l =new ArrayList<>();
        List<Integer> l2 =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                l.add(0);
            }
            else{
                l2.add(arr[i]);
            }
        }
         l2.addAll(l);
        System.out.println(l2);

    }
}
