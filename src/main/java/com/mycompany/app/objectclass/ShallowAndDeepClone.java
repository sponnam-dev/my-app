package com.mycompany.app.objectclass;

public class ShallowAndDeepClone {
    public static void main(String[] args) {
        Course c1 = new Course("Maths");
        Student s1 = new Student("swapna", c1);
        Student s2 = s1;// assing nothing default version of clone()
        System.out.println(s2.course.name);
        s2.course.name="Science";
        System.out.println(s1.course.name);
        //==============================
        Dept d = new Dept("Engineering", c1);
        try{
            Dept d1 = (Dept)d.clone();
            System.out.println(d1.course.name);
            d1.course.name="Medical";
            System.out.println(d.course.name);
        } catch (CloneNotSupportedException ce){
            ce.printStackTrace();
        }



    }
}
class Student {
    String stName;
    Course course;
    Student(String stName, Course course){
        this.stName = stName;
        this.course = course;

    }

}
class Course{
    String name;
    Course(String name){
        this.name = name;
    }

}
class Dept implements Cloneable{
    String name;
    Course course;
    Dept(String name, Course course){
        this.name = name;
        this.course = course;
    }
    protected  Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}