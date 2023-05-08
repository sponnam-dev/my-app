package com.mycompany.app.java8features;

public class DefaultMethodFrom2Interfaces {
    public static void main(String[] args) {

    }
}

interface A{

    public abstract void m2();
default void m1(){
    System.out.println("calling default method from interfaceA");
}
static void m3(){
    System.out.println("calling static method from interfaceA");
}

}
interface B{
    default void m1(){
        System.out.println("calling default method from interfaceB");
    }
}
class Test implements  A{

    @Override
    public void m2() {

    }
}
class Test1 implements  A,B{

    @Override
    public void m2() {

    }

    @Override
    public void m1() {
        A.super.m1();
    }
}

