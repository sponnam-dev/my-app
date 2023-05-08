package com.mycompany.app.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MethodReferenceOperator {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("swapna");
        namesList.add("padma");
        namesList.forEach(GMG::getData);
        namesList.forEach(GMG::getName);
        GMG g1 =new GMG("abcd");
        namesList.forEach(g1::getFname);
        //Instance method of an arbitrary object of a particular type
        List<GMG> gMGList = new ArrayList<>();
        gMGList.add(new GMG("swapna"));
        gMGList.add(new GMG("padma"));
        gMGList.forEach(GMG::getLname);
        // Java code to show use of double colon operator
        // for class constructor
        namesList.forEach(GMG::new);
    }
}

class GMG extends Test {
    String fullName=null;
    GMG(String s){
        this.fullName = s;
        System.out.println("constructor calling===");
    }
    static void getData( String name){
        System.out.println("static method calling..."+name);
    }
    static String getName(String name){
        System.out.println("static method with return type..."+name);
        return name;
    }
     String getFname(String name){
        System.out.println("instance method with return type..."+name);
        return name;
    }
    void getLname(){
        System.out.println("instance method calling..."+this.fullName);
        //return name;
    }


}
class Test {

    // super function to be called
    String print(String str)
    {
        return ("Hello " + str + "\n");
    }
}

