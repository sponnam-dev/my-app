package com.mycompany.app.collections.array;

import java.util.Arrays;

public class Reverse3Elements {
    public static void main(String[] args) {
        System.out.println("helloworld==");
        /**
         * reverse the every three values
         * int aa[]={1,2,3,4,5,6,7,8,9};
         * out put should be {3,2,1,6,5,4,9,8,7};
         */
        int arr[]={1,2,3,4,5,6,7,8,9};
        int t = 2;
        int i=0;
        while(i < t && t < arr.length){
            int temp = arr[t];
            arr[t] = arr[i];
            arr[i] = temp;
            i=t+1;
            t=t+3;
        }

        Arrays.stream(arr).forEach(System.out::println);


    }
}
