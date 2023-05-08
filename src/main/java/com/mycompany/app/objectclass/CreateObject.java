package com.mycompany.app.objectclass;

import java.io.*;

public class CreateObject implements Serializable {
    String personName;
    CreateObject(String personName){
        this.personName = personName;
    }

    public static void main(String[] args) throws Exception{
        //Using new keyword
        A a = new A();
        a.m1();

        //using new instance
       // Class cls = Class.forName(A.class);//class should be in public scope
        //A a1= (A)cls.newInstance();
        // //a1.m1();

        //using clone() method
        System.out.println("shallow clone ====");


        B k = new B();
        B k1 =k;
        k1.name="Test";
        System.out.println(k1.name);
        System.out.println(k.name);
        System.out.println("deep cloning====");
        B b = new B();
        B b1= (B)b.clone();
        b1.name="ponnam";

        System.out.println(b1.name);
        System.out.println(b.name);

        //Serializing data
        CreateObject cr = new CreateObject("padmaponnam");
        FileOutputStream fos = new FileOutputStream("file.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(cr);

        //deserializing ..
        // Creating FileInputStream class object
        FileInputStream f
                = new FileInputStream("file.txt");

        // Creating ObjectInputStream class object
        ObjectInputStream oos
                = new ObjectInputStream(f);
        CreateObject d = (CreateObject)oos.readObject();
        System.out.println("After deserialization "+d.personName);

    }
}
class A{
    A(){
        System.out.println("hello from A");
    }
    void m1(){
        System.out.println("m1() calling======");
    }
}

class B implements Cloneable{

    String name= "swapna";
    @Override
    protected  Object clone() throws CloneNotSupportedException{
            return super.clone();
    }
}