package com.mycompany.app.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        int i;
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new PathScanner());
        service.submit(new Counter());

        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);

        System.exit(0);
    }

    public static class PathScanner implements Callable<Object> {

        @Override
        public Object call() throws Exception {
            for (int index = 0; index < 10; index++) {
                //Thread.sleep(1);
                System.out.println(index);
            }
            scan();
            return null;
        }

        protected void scan() {
            System.out.println("from PathScanner ===========");
        }
    }
    public static class Counter implements Callable<Object> {

        @Override
        public Object call() throws Exception {
            for (int index = 11; index < 21; index++) {
              //  Thread.sleep(1);
                System.out.println(index);
            }
            return null;
        }
    }

}
