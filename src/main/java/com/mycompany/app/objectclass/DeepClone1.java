package com.mycompany.app.objectclass;

public class DeepClone1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course1 c1= new Course1("EVS");
        Studt s1= new Studt(1,"ponnam",c1);
        Studt s2=s1.clone();
        System.out.println(s2.cource.name);
        s1.cource.name="Maths";
        System.out.println(s2.cource.name);
    }
}
class Studt implements Cloneable{
    int id;
    String name;
    Course1 cource;
    public Studt(int id, String name, Course1 course){
        this.id = id;

        this.name = name;

        this.cource = course;

    }

    public Studt clone() throws CloneNotSupportedException {
        Studt st = (Studt)super.clone();
        st.cource = (Course1) cource.clone();
        return st;
    }
}

class Corse1 implements Cloneable{

    String name;

  public  Corse1(String cource){
        this.name=cource;
    }

}
