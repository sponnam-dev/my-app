package com.mycompany.app.threads;

public class SequenceNumFromTwoThreads {
    public static void main(String[] args) {
        int arr[] ={1,3,5};
        int arr1[] = {2,4,6};

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<arr.length;i++){
                    try {
                        wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(arr[i]);
                    notify();
                }
            }
        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<arr1.length;i++){
                    try {
                        System.out.println(arr1[i]);
                        wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    notify();
                }
            }
        });
        t.start();
        t1.start();
    }
}
