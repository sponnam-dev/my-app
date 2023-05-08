package com.mycompany.app.abstraction;

public class Main {
    public static void main(String[] args) {
        int n= 10;
        int i =0;
        int fi=1;
        int n1 =0;
        int n2=1;

        while(i< n){
            fi = n1+n2; //1
            System.out.println(n1);
            n1=n2;
            n2 =fi;
            i++;
        }


        /*Animal a = new Cat();//Abstract can create instance of subclass
        System.out.println(a.sound());*/
    }
}
