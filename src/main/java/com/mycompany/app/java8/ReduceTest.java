package com.mycompany.app.java8;

import java.util.*;

public class ReduceTest {
    //In Java 8, the Stream.reduce() combine elements of a stream and produces a single value.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers1 = {4, 2, 3};
        // 1st argument, init value = 0
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        System.out.println("sum : " + sum); // 55
        int mul = Arrays.stream(numbers1).reduce(1, (a, b) -> a * b);
        System.out.println("mul : " + mul); // 55
        int sub = Arrays.stream(numbers1).reduce(1, (a, b) -> a - b);
        System.out.println("sub : " + sub); // 55
        int division = Arrays.stream(numbers1).reduce(0, (a, b) -> a/b);
        System.out.println("division : " + division); // 55

        OptionalInt sub1 = Arrays.stream(numbers1).reduce((a, b) -> a - b);
        System.out.println(sub1.getAsInt());

        int sum1 = Arrays.stream(numbers).reduce(0, Integer::sum); // 55


        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);  // 10
        int max1 = Arrays.stream(numbers).reduce(0, Integer::max);            // 10

        int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);  // 0
        int min1 = Arrays.stream(numbers).reduce(0, Integer::min);


        Customer c1 = new Customer("swapna","New",1234);
        Customer c2 = new Customer("Test","Regular",2323);
        Customer c3 = new Customer("Dummy","Regular",2345);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
       Customer ct=customerList.stream().max(Comparator.comparing(e->e.customerId)).get();
       System.out.println(ct.customerId);
    }
}
class Customer{
    String name;
    String cutomerType;
    Integer customerId;
    public Customer(String name, String cutomerType,Integer customerId){
        this.name=name;
        this.customerId=customerId;
        this.cutomerType= cutomerType;
    }
}