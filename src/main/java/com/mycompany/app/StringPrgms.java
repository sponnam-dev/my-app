package com.mycompany.app;

import java.util.Arrays;
import java.util.Scanner;

public class StringPrgms {

    public static void main(String[] args){
        anagram();
    }


    public static void isTwoStringsEqual(){
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Two Strings are equal");
        }

    }
    public static void anagram(){
        String str1, str2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First String");
        str1 = scanner.nextLine();

        System.out.println("Enter Second String");
        str2 = scanner.nextLine();

        str1.chars();

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(array1);
        System.out.println(array2);
        if (String.valueOf(array1).trim().equals(String.valueOf(array2).trim())) {
            System.out.println("Anagram String");
        } else {
            System.out.println("Not Anagram String");
        }
    }


}
