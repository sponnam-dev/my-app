package com.mycompany.app.collections;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class CustomComparator {
    public static void main(String[] args) {
        Employee e1 = new Employee("ab", 12);
        Employee e2 = new Employee("bc", 3);
        Employee e3 = new Employee("ba", 13);
        Employee e4 = new Employee("ca", 1);
        Employee e5 = new Employee("abc", 18);
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

       Optional<Integer> maxInt =  empList.stream().map(x->x.getAge()).max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2 ;
            }
        });
       if(maxInt.isPresent()){
           System.out.println(maxInt);
           System.out.println(maxInt.get());
       }
        empList.stream().mapToInt(x->x.getAge()).summaryStatistics().getSum();

       // Collections.sort(empList);



        empList = empList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.age-o1.age;
            }
        }).collect(Collectors.toList());

       empList.forEach(emp->
       {
           System.out.println(emp.age);;
       });
        Comparator cmp = Comparator.comparing((Employee e)-> e.name);
        Collections.sort(empList,cmp);

       empList.stream().sorted(new NameComparator()).collect(Collectors.toList()).forEach(emp->
               {
                   System.out.println(emp.name +" "+emp.age);
               }
               );
        Collections.sort(empList,new NameComparator().reversed());
        empList.forEach(e->
        {
            System.out.println(e.name +" "+e.age);
        });//lexicographic-order

        List<String> strList  = new ArrayList<>();
        strList.add("ab");
        strList.add("bcd");
        strList.add("dcb");
        strList.add("acd");
        strList.add("aedb");
        strList.add("acdb");
        Collections.sort(strList);
        System.out.println(strList.toString());
        //Compare by first name and then last name
        Comparator<Employee> compareByName = Comparator
                .comparing(Employee::getAge)
                .thenComparing(Employee::getName);

        Collections.sort(empList, compareByName);
       empList.forEach(emp->{
           System.out.println(emp.getName()+" "+emp.getAge());
       });
    }
}
class Employee {


    String name;
    int age;
    public Employee(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
class NameComparator implements  Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
