package com.mycompany.app.java8;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Employee emp = new Employee(null,2300,32);
        Optional<Employee> os = Optional.ofNullable(emp);
       // os.
        System.out.println(os.get());
    }
}
