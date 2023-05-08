package com.mycompany.app.threads;

class Q{
    int num;
    boolean valueSet=false;
    public synchronized void put(int num){
        while(valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       this.num=num;
        valueSet=true;
        notify();
        System.out.println("put "+num);
    }
    public synchronized void get(){
        System.out.println("get "+num);
        while(!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = false;
        notify();
    }
}
class Prodcucer implements Runnable{
    Q q;
    public Prodcucer(Q q) {
        this.q = q;
        Thread t1 = new Thread(this,"Producer");
        t1.start();
    }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consmer implements Runnable{
    Q q;
    public Consmer(Q q) {
        this.q = q;
        Thread t2 = new Thread(this,"Consumer");
        t2.start();
    }
    public void run(){
        while(true){
            q.get();
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class InterThreadCommunication {

    public static void main(String[] args){
        Q q= new Q();
        new Prodcucer(q);
        new Consmer(q);
    }

}
