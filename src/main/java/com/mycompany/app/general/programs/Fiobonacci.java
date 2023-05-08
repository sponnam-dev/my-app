package com.mycompany.app.general.programs;

public class Fiobonacci {
static  int n1=0,n2=1, n3 =0;
    public static void main(String[] args) {
        int count =10;
       // fibonacciWithOutRecursive();
        recursiveFibonaci(count);
    }
    static void recursiveFibonaci(int count){

            if(count > 0){
                System.out.println(n1);
                n3 = n1+n2;
                n1=n2;
                n2=n3;
                recursiveFibonaci(count-1);
            }
    }
    static void fibonacciWithOutRecursive(){
        int n=10;
        int i =0;
        int n1 =0;
        int n2 = 1;
        int fi =0;
        while(i<n){
            fi =n1 + n2;
            System.out.println(n1);
            n1=n2;
            n2 =fi;
            i++;
        }
    }
}
