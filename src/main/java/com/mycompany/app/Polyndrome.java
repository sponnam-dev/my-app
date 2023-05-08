package com.mycompany.app;

import java.util.Scanner;

public class Polyndrome {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.next();
        StringBuffer sb = new StringBuffer(input);
        String s1= sb.reverse().toString();
        System.out.println(s1);
    }
}
