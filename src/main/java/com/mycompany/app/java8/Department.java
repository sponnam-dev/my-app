package com.mycompany.app.java8;

public class Department {
    Integer id;
    String deptName;
    Department(Integer id, String deptName){
        this.id=id;
        this.deptName =deptName;
    }
    public Integer getId() {
        return id;
    }

    public String getDeptName() {
        return deptName;
    }

}
