package com.mycompany.app.inheritance;

public class CovariantReturnType {

    public CovariantReturnType() {
        super();
        //this(); these both to be in the first line of  constructor

    }
    //method overriding
    public static void main(String[] args) {
        A a = (A) new B().m1();
        a.m1();
    }



}
class A{
    A m1(){
        System.out.println("hello from A");
        return this;
    }
}

class B extends A{
    B m1(){
        System.out.println("helllo from B ");
        return this;
    }
}
