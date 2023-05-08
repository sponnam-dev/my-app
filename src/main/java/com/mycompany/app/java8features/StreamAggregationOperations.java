package com.mycompany.app.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamAggregationOperations {
    public static void main(String[] args) {
        Department dept1 = new Department(1,"FS");
        Employee emp1 = new Employee("xx",1000,dept1);
        Department dept2 = new Department(3,"NMS");
        Employee emp2 = new Employee("yy",500,dept2);
        Department dept3 = new Department(2,"RD");
        Employee emp3 = new Employee("zz",2500,dept3);
        Department dept4 = new Department(4,"FS");
        Employee emp4 = new Employee("mm",2000,dept4);
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        //Task 1: emplist by Sorting salaries
        Collections.sort(empList,Comparator.comparing(Employee::getSalary));
        empList.forEach(s->{
            System.out.println(s.getName() + "- "+s.getSalary());
        });
        //or
       empList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(s->{
            System.out.println(s.getName() + "- "+s.getSalary());
        });

       //Task 2 : show employees grouping by dept
     //   empList.stream().
    }

}
class Employee{
 String name;
 Integer salary;

 Department dept;

 Employee(String name, Integer salary, Department dept){
 this.dept=dept;
 this.name=name;
 this.salary=salary;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
class Department{
    Integer deptId;
    String deptName;
    Department(Integer deptId, String deptName){
        this.deptId =deptId;
        this.deptName = deptName;
    }

}