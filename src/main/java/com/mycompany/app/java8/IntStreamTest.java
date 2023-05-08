package com.mycompany.app.java8;

import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamTest {
    public static void main(String[] args) {
        String input= "I am feeling happy";
        String in =input.replaceAll("\\s","");
        Set<Character> set = new HashSet<>();
        List<Character> l =in.chars().mapToObj(c->(char)c ).filter(c->!set.add(c)).collect(Collectors.toList());
        System.out.println(l);
        System.out.println(set);
        System.out.println(input.chars().max().getAsInt());
        char[] c=input.toCharArray();
        int[] arr={5,1,7,2};
        int max = IntStream.of(arr).max().getAsInt();
        System.out.println("max:"+max);
        int min =IntStream.of(arr).min().getAsInt();
        System.out.println("min:"+min);
        int sum = IntStream.of(arr).sum();
        System.out.println("sum :"+sum);
        OptionalDouble average =IntStream.of(arr).average();
        System.out.println("average "+average.getAsDouble());
        IntStream.of(arr).sorted().boxed().forEach(System.out::println);
    }
}
