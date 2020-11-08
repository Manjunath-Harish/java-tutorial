package com.man.thread.problems;

public class WaitForMainThread {

  public static void main(String[] args) {
    MyRunnableWaitForMainThread.mainThread = Thread.currentThread();
    MyRunnableWaitForMainThread myRunnable = new MyRunnableWaitForMainThread();
    Thread t1 = new Thread(myRunnable);
    t1.start();
//    t1.interrupt();
    System.out.println("Main Thread");
  }
}

class MyRunnableWaitForMainThread implements Runnable{

  static Thread mainThread;
  @Override public void run() {
    try {
      mainThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Child Thread");
  }
}
