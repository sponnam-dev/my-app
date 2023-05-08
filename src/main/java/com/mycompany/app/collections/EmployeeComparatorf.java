package com.mycompany.app.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparatorf {
    public static void main(String[] args) {
        EmployeeTest e1 = new EmployeeTest("xx",1000);
        EmployeeTest e2 = new EmployeeTest("yy",500);
        EmployeeTest e3 = new EmployeeTest("zz",2000);
        List<EmployeeTest> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        Collections.sort(empList,EmployeeTest.salaryComparator);
        empList.forEach(e->{    
                System.out.println(e.name+" "+e.salary);
        });
    }

}
class EmployeeTest{

    String name ;
    Integer salary;

    public EmployeeTest(String name, Integer salary){
        this.name=name;
        this.salary =salary;
    }

    public static final Comparator<EmployeeTest> salaryComparator = new Comparator<EmployeeTest>() {
        @Override
        public int compare(EmployeeTest o1, EmployeeTest o2) {
            return o1.salary-o2.salary;
        }
    };

}
