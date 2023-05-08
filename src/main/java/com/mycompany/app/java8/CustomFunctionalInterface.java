package com.mycompany.app.java8;

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        Table<Boolean,String> t =(x)-> x.length() > 0;
        System.out.println( t.apply("swapna"));

        Runnable r = ()->System.out.println("Helloo");
        Thread th = new Thread(r);
        th.start();

    }
}
@FunctionalInterface
interface Table<T,R>{
  T apply(R r) ;

}