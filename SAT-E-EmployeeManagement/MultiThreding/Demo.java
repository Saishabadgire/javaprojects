package com.sate.MultiThreding;

class MyThread extends Thread {
    
    @Override
    public void run() {
        System.out.println("Name of MyThread class is: " + Thread.currentThread().getName());
        System.out.println("My thread is running");
    }
}

public class Demo {

    public static void main(String[] args) {
        System.out.println("Current thread inside main() is : " + Thread.currentThread().getName());
        
        MyThread thythread = new MyThread();
        thythread.start();
    }
}