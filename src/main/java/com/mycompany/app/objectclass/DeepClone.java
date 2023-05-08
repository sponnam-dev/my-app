package com.mycompany.app.objectclass;

public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException{
        Course1 c1 = new Course1("Maths");
        Student1 s1 = new Student1("swapna", c1);
        Student1 s2 = (Student1) s1.clone();// assing nothing default version of clone()
        System.out.println(s2.course.name);
        s2.course.name="Science";
        System.out.println(s1.course.name);
        System.out.println(s2.course.name);
    }
}
class Student1 implements  Cloneable{
    String stName;
    Course1 course;
    Student1(String stName, Course1 course){
        this.stName = stName;
        this.course = course;
    }
    protected  Object clone() throws  CloneNotSupportedException{
       Student1 st1 = (Student1) super.clone();
       st1.course = (Course1) course.clone();
       return st1;
    }

}
class Course1  implements Cloneable{
    String name;
    Course1(String name){
        this.name = name;
    }
    protected  Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }
}