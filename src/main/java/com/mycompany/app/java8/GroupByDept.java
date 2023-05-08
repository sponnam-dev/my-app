package com.mycompany.app.java8;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByDept {
    public static void main(String[] args) {
        Map<Department, List<Employee>> deptEmpListMap = new HashMap<>();

        Department d1 = new Department(2,"Engineer" );
        Department d2 = new Department(5,"DevOps" );
        Department d3= new Department(2,"QA" );
        Employee e1 = new Employee("swapna",1000,20);
        Employee e2 = new Employee("padma",800,30);
        Employee e3 = new Employee("test",3000,37);
        Employee e4 = new Employee("test",2000,32);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        deptEmpListMap.put(d1, Arrays.asList(e1,e4));
        deptEmpListMap.put(d2,Arrays.asList(e2,e3));
        Map<String,Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
        System.out.println(map);
        Map<String,Optional<Employee>> map1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(map1);
        Integer sum = employeeList.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println("summ "+sum);
        Map<String, Integer> mapp = employeeList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.summingInt(Employee::getSalary)));
        System.out.println("sum of salary for each employee name "+mapp);
        /*  deptEmpListMap.entrySet().stream().max(x->x.getValue().stream().max(Comparator.comparing(y->y.salary)))
                .collect(Collectors.groupingBy(s->s.getKey()))*/
        //deptEmpListMap.entrySet().stream().collect(Collectors.groupingBy(Department::getDeptName,Collectors.maxBy(Comparator.comparing(Employee::getSalary))))

      /*  yourTypes.stream()
                .collect(Collectors.groupingBy(
                        ObjectA::getType,
                        Collectors.mapping(
                                ObjectA::getId, Collectors.toList()
                        )))*/
    }
}
