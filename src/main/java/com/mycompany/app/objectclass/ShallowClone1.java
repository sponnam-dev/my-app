package com.mycompany.app.objectclass;

public class ShallowClone1 {
    public static void main(String[] args) {
        Cource c1= new Cource("English","Maths","Science");
        Studet s1 = new Studet(1, "swapna",c1);
        Studet s2= s1;
        System.out.println("Cources : "+s2.cource.subject1);

        s1.cource.subject1="social";

        System.out.println("After assigning : "+s2.cource.subject1);
    }
}
class Cource{
    String subject1;
    String subject2;
    String subject3;
   public Cource(String sub1, String sub2, String sub3){
       this.subject1 = sub1;

       this.subject2 = sub2;

       this.subject3 = sub3;
    }
}
class Studet{
    int id;
    String name;
    Cource cource;
    public Studet(int id, String name, Cource course){
        this.id = id;

        this.name = name;

        this.cource = course;

    }
}