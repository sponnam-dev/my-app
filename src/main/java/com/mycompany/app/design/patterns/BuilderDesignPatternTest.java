package com.mycompany.app.design.patterns;
public class BuilderDesignPatternTest {
    public static void main(String[] args) {
        Employee1 emp = new EmployeeBuilder().setAge(1).setName("swapna").build();
        System.out.println(emp);
        Employee1 emp1 = new EmployeeBuilder().setAge(1).build();
        System.out.println(emp1);
    }

}
class Employee1{
    String name;
    int age;
    public Employee1(String name, int age){
        this.name = name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class EmployeeBuilder{
    private String name;
    private int age;
    public EmployeeBuilder setName(String s){
        this.name=s;
        return this;
    }
    public EmployeeBuilder setAge(int age){
        this.age=age;
        return this;
    }
    Employee1 build(){
        return new Employee1(name,age);
   }
}