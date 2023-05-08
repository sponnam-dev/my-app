package com.mycompany.app.collections.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortOrder {
    public static void main(String[] args) {
        //ascendingOrder();
        //updateIndexValue();
       // exchangeIndexValue();
        removeIndexValue();
        Map m = new HashMap<>();
    }
    //remove ith value
    public static void removeIndexValue(){
        int i=2;
        int arr[] ={2,3,4,7,9,8};
        int m=0;
        int b[] = new int[arr.length];
        for(int k =0,j=0;k<=arr.length-m && j <= arr.length-m;k++,j++){
            if(i==j){
                j=j+1;
                m=m+1;
            }
            b[k] = arr[j];

        }
        System.out.println(Arrays.toString(b));

        for(int j=i+1; j< arr.length;j++){
            arr[j-1] = arr[j];
        }
        System.out.println(Arrays.toString(arr));
    }

    //two index values exchange
    public static void exchangeIndexValue(){
        int i=2, j=5;
        int arr[] = {2,5,7,9,11,13,15};
        if(arr.length > i && arr.length > j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }


    public static void ascendingOrder() {
        int arr[] = {6, 1, 9, 3, 7, 4};
        int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //update 3rd index value
    public static void updateIndexValue(){
        int i =3;
        int arr[] = {8,3,9,3,4,2,1};
        if(arr.length > i ){
            arr[i] = 12;
        }
        System.out.println(Arrays.toString(arr));
    }
}

