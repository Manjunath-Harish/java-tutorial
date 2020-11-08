package com.man.thread;

public class MultiThreadDemo {
  public static void main(String[] args) {
    System.out.println("Main thread started : "+Thread.currentThread());

    Thread thread1 = new Thread(new FirstThread());
    thread1.setName("FirstThread");
    thread1.setPriority(Thread.NORM_PRIORITY);
    thread1.start();

    Thread thread2 = new Thread(new SecondThread());
    thread2.setName("SecondThread");
    thread2.setPriority(Thread.MIN_PRIORITY);
    thread2.start();

    Thread thread3 = new Thread(new ThirdThread  ());
    thread3.setName("ThirdThread");
    thread3.setPriority(Thread.MAX_PRIORITY);
    thread3.start();

  }
}

class FirstThread implements Runnable{

  @Override
  public void run() {
    System.out.println("1st thread started : "+Thread.currentThread());
  }
}

class SecondThread implements Runnable{

  @Override
  public void run() {
    System.out.println("2nd thread started : "+Thread.currentThread());
  }
}

class ThirdThread implements Runnable{

  @Override
  public void run() {
    System.out.println("3rd thread started : "+Thread.currentThread());
  }
}
