package com.man.thread.problems;

public class WaitForChildThread  {

  public static void main(String[] args) throws InterruptedException {
    MyRunnableWaitForChildThread myRunnable = new MyRunnableWaitForChildThread();
    Thread t1 = new Thread(myRunnable);
    t1.start();
    t1.join();
    System.out.println("Main Thread");
  }
}

class MyRunnableWaitForChildThread implements Runnable{

  @Override
  public void run() {
    System.out.println("Child Thread");
  }
}
