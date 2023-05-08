package com.mycompany.app.general.programs;

public class ArmStrongNum {
    public static void main(String[] args) {
        int originalNumber = 153;
        int num =originalNumber;

        int sum =0;
        while(num > 0){
            System.out.println(num);
            int n = num % 10;
            sum = sum + (n * n* n);
            System.out.println(sum);
            num = num / 10;

        }
        if(originalNumber == sum)
        System.out.println(originalNumber + " is an Armstrong number.");
        else
        System.out.println(originalNumber + " is not an Armstrong number.");

    }
}
