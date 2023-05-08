package com.mycompany.app.general.programs;

import java.util.function.BiConsumer;

public class Test {
    //compulsory initialization required for final instance variable either using constructor or assign value at the declaration
    final int i;

    public Test(int i) {
        this.i = i;
    }

    public static void main(String[] args) throws Exception {

        //after post increment value of the variable
        int i=5;
        System.out.println(i++);//i=5;i=5+1
        System.out.println(++i);//i=6+1 i=7

        BiConsumer<Integer,Integer> bi =(x, y)-> System.out.println(x+y);
        bi.accept(1,2);
    }
}
