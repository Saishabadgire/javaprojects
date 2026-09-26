package com.sate.MultiThreding;

// class MyThread implements Runnable {
//     @Override
//     public void run() 
//     {
//         for(int i=1;i<=5;i++) {
//             System.out.println("Name of MyThead "+Thread.currentThread().getName()+":"+i);
//         }
//     }
// }

public class Demo1 {
    public static void main(String[] args) {

        // System.out.println("Current therad inside main() is : "+Thread.currentThread().getName());
        
        // MyThread myThread=new MyThread();
        // Thread t1=new Thread(myThread);         //AN NOT ACCESS RUNABLE DIRECTLY BEACUSE IT IS A INTERFACE SO WE NEED TO CREATE A THREAD OBJECT AND PASS THE RUNABLE OBJECT TO IT
        // t1.start();

        // same thing can be done using lambda expression
        Thread t2=new Thread(()-> {
                System.out.println("Name of MyThead "+Thread.currentThread().getName());

    // 2 join (); used for to wait other code to compler thread execution first 
    //              try {
    //             Thread.sleep(3000);
    //                 }
    //              catch (InterruptedException e) {
    //                e.printStackTrace();
    //                   }
    //             System.out.println("i am enjoy learninh java");
    //             System.out.println("sat e solution"); 

        });

    //    t2.start();
    //    t2.join(); 

       t2.start();
     // t2.start // illegal thread exception(cheked exception) we can not start same thread object twice on same thread 
      
      t2.setName("sat e thread");

      System.out.println(t2.isAlive());   // to check if thread is alive or not

    }

}