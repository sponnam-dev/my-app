package com.mycompany.app.collections.map;

public class TestMap {
    public static void main(String[] args) {
        Integer i = 21045;
        System.out.println(i.hashCode() % 16);
        User u =new User("swapna","ponnam");
       // System.out.println(hashCode());

    }
}
class User {
    String firstName;
    String lastName;
    User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
