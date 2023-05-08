package com.mycompany.app.java8;

public class Employee {


    String name;
    Integer salary;
    Integer age;

    Employee(String name, Integer salary, Integer age){
        this.name = name;
        this.salary=salary;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
