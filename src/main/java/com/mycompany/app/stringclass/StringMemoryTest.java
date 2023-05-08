package com.mycompany.app.stringclass;

public class StringMemoryTest {

    public static void main(String[] args) {
        String a = "swapna";
        System.out.println(a.hashCode());
        a = "ponnam";
        System.out.println(a.hashCode());
        System.out.println(a);
        a="swapna";
        System.out.println(a.hashCode());
        Emp e1 = new Emp("swapna",2);
        Emp e2 = new Emp("Test1",6);
        Emp e3 = new Emp("swapna",2);

        System.out.println(e1==e2);
        System.out.println(e1==e3);
        System.out.println(e1.hashCode());//460141958
        System.out.println(e2.hashCode());//1163157884
        Object o = new Object();
        o.hashCode();

    }

}
class Emp{
    String name;
    int age;
    public Emp(String name,int age){
        this.name = name;
        this.age= age;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode(){
        return 1;
    }

}
