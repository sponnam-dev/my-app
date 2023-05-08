package com.mycompany.app.general.programs;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello";
        String reverse= "";
        for(int i=0; i< str.length();i++){
            reverse = str.charAt(i)+reverse;

        }System.out.println(reverse);

    }
}
