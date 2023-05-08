package com.mycompany.app.general.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static void main(String[] args) {
        int arr[] ={46,46,48,49,41,45,45};
        //first need to remove duplicates
        List<Integer> list =IntStream.of(arr).distinct().boxed().sorted().collect(Collectors.toList());
        System.out.println(list);

        for(int i =0; i<list.size();i++){

           Integer currentVal = list.get(i);
            System.out.println("current Value"+currentVal);
           int j =i+1;
           if(j< list.size()){
               Integer  nexVal = list.get(j);
               int diff = (nexVal-currentVal)-1;
               System.out.println("missing numbers");
               while(diff > 0){
                   currentVal = currentVal +1 ;
                   System.out.print(currentVal+" ");
                   diff= diff-1;
               }
           }

        }
    }
}
