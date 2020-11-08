package com.man.thread;

public class MyThread extends Thread {
  @Override
  public void run(){
    int n = 10;
    for (int i=0;i < n-1;i++){
      System.out.println("c: "+i);
    }
  }

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();

    int n = 10;
    for (int i=0;i < n-1;i++){
      System.out.println("m :"+i);
    }
  }
}

