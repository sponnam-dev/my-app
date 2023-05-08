package com.mycompany.app.threads;

public class ThreadLocalVariableTest {

    public static void main(String[] args) {
        Thread1 runnableInstance = new Thread1(2);
        Thread1 runnableInstance1 = new Thread1(5);
        Thread t1 = new Thread(runnableInstance);
        Thread t2 = new Thread(runnableInstance1);
        // this will call run() method
        t1.start();
        t2.start();
    }
}
class Thread1 implements Runnable{
    int num =0;
 public Thread1(int num){
    this.num= num+1;
     System.out.println(Thread.currentThread().getName()+""+num);
 }
    private ThreadLocal<Integer> threadLocal =
            new ThreadLocal<Integer>();
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        threadLocal.set( num);
        try
        {
            System.out.println("number from threadlocal"+threadLocal.get());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(threadLocal.get());
    }
}