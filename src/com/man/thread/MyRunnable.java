package com.man.thread;

public class MyRunnable implements Runnable{
  public static void main(String[] args) throws InterruptedException {
    MyRunnable runnable = new MyRunnable();
    Thread thread = new Thread(runnable);
//    thread.setPriority(1);
//    Thread.currentThread().setPriority(10);
    thread.start();
    thread.join();
    Thread.currentThread().setName("Manjunath" );
    //Thread.currentThread().setPriority(4);
    System.out.println("Main thread name: "+Thread.currentThread());
    System.out.println("Main thread group: "+Thread.currentThread().getThreadGroup());
    System.out.println("Main thread group name: "+Thread.currentThread().getThreadGroup().getName());
    System.out.println("Main thread group Parent : "+Thread.currentThread().getThreadGroup().getParent());
    for (int i=0;i < 5;i++){
      System.out.println("m :"+i);
      //Thread.sleep(500);
    }
  }

  @Override
  public void run() {
    Thread.currentThread().setName("Aishwarya");
    System.out.println("Child thread name: "+Thread.currentThread());
    for (int i=0;i < 5;i++){
//      if(i==2) {
//        Thread.yield();
//      }
//      try {
//        //Thread.sleep(1000);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
      System.out.println("c :"+i);
    }
  }
}
