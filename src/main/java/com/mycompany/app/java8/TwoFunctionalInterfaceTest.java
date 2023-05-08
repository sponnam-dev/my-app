package com.mycompany.app.java8;

public interface TwoFunctionalInterfaceTest {
    public static void main(String[] args) {
        ParentInterface<Integer,Integer> p =(x)->x++;
        Integer n =p.m1(2);
        System.out.println(n);
        //YoungInterface<Integer,Integer> y = (x)-> 1;
        //Integer l = y.m3(1);
        //https://stackabuse.com/a-guide-to-jpa-with-hibernate-relationship-mapping/
        YoungInterface<Integer,Boolean> yng = new D();
        Boolean b= yng.m3(6);
        yng.m2();
        J j = new E();
        j.m5(j);
        K k = new E();
        k.m5(k);
    }
}
//@FunctionalInterface
interface  ParentInterface<T,R>{
    R m1(T t);
   // R m2(T t);
}
//@FunctionalInterface
interface  childInterface<T,R>  {

    //R m1(T t);
    R m2();
}
//@FunctionalInterface//two functional intefaces can't extend another functional interface
interface  YoungInterface<T,R> extends ParentInterface,childInterface{
   R m3(T t);
    //R m2(T t);
}
class A{
    void m3(){
        System.out.println("it is from class A");
    }
}
class B {
    void m3(){
        System.out.println("it is from class A");
    }
    void m4(){
        System.out.println("it is from class A");
    }
}

//class C extends  A , B{ //compileTime Error since multiple inheritance won't be support in class level


class D implements  YoungInterface<Integer,Boolean>{

    @Override
    public Object m1(Object o) {
        return null;
    }

    @Override
    public Object m2() {
        return null;
    }

    @Override
    public Boolean m3(Integer integer) {
        return null;
    }
}
interface  J{
    void m5(Object obj);
    default void m6(){
        System.out.println("It is from default method m6()");
    }
    default void m7(){
        System.out.println("It is from default method m7()");
    }
    static int m8(){
        System.out.println("It is from static method m8()");
        return 0;
    }
    static int m9(){
        System.out.println("It is from static method m9()");
        return 0;
    }
}
interface  K{
    void m5(Object obj);
}

class E implements  J,K {

    static int m9(){
        System.out.println("It is from static method m9()");
        return 0;
    }
    /**default void m7(){
        System.out.println("It is from default method m7()");
    }**/
    @Override
    public void m5(Object obj) {
        if(obj instanceof  J){
            System.out.println("J interface method calling");
        }
        if(obj instanceof  K){
            System.out.println("K interface method calling");
        }

    }

}