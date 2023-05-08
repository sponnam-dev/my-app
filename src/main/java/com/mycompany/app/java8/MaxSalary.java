package com.mycompany.app.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalary {
    public static void main(String[] args) {
        //find Max salary
        Employee e1 = new Employee("swapna",1000,20);
        Employee e2 = new Employee("padma",800,30);
        Employee e3 = new Employee("test1",3000,37);
        Employee e4 = new Employee("test",2000,32);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        Integer maxVal = employeeList.stream().collect(Collectors.summarizingInt(e->e.salary)).getMax();
        System.out.println(maxVal);
        Optional<Employee> maxVal1 = employeeList.stream().filter(e->e.getAge() < 30).collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("salary "+maxVal1.get().salary+" name"+maxVal1.get().name);

        Integer minVal = employeeList.stream().collect(Collectors.summarizingInt(e->e.salary)).getMin();
        System.out.println(minVal);
        Optional<Employee> minVal1 = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("salary "+minVal1.get().salary+" name"+minVal1.get().name);
    }
}
