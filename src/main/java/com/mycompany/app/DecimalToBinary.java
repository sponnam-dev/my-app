package com.mycompany.app;

public class DecimalToBinary {

    public static void main(String[] args) {
        int  n= 23;
        int arr[] = new int[40];
        int index=0;
        int r;
        while(n>0){
            arr[index++]=n%2;
            n=n/2;
        }
        for(int i=index-1;i>=0;i--){
            //System.out.print(arr[i]);
        }
       // System.out.println();
        //countNoOFDigitsInANumber();
        //convertBinaryToDecimal();
        ascendingOrder();
    }


    public static void countNoOFDigitsInANumber(){
        int n =345;
        int count = 0;
        while(n != 0){
            n=n/10;
            System.out.println(n);
            ++count;
        }

        System.out.println("no of digits in a numberv is "+count);
    }

    public static void convertBinaryToDecimal(){
        int n =10111;
        int r =0;
        int i=0;
        int sum=0;
        while(n > 0){
            r=n%10;
            n=n/10;
            int j = (int)Math.pow(2,i);
            sum = r*j+sum;
            i++;
        }
        System.out.println();
    }

    public static void ascendingOrder(){
        int arr[] ={5,2,7,4,8,1};
        int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
              }
            System.out.println(arr[i]);
        }
    }




}
