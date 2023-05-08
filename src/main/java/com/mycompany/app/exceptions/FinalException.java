package com.mycompany.app.exceptions;

public class FinalException {
    public static void main(String[] args) {
        try{
            System.out.println("Hellllo I am in try");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            throw  new ArithmeticException("Exception occurred in final block");
        }
    }
}
