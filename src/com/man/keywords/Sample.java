package com.man.keywords;

public class Sample {

  int x = 10;
  static int y = 20;

  public static void main(String[] args) {
    Sample sample = new Sample();
    sample.m1();
  }

  public void m1(){

    int x = 100;
    int y = 200;
    System.out.println("Simple xy printing");
    System.out.println(y);
    System.out.println(x);

    System.out.println("xy printing using this");
    System.out.println(this.y);
    System.out.println(this.x);

    System.out.println(Sample.this.y);
    System.out.println(Sample.this.x);

//    System.out.println(SampleTest.this.y);
//    System.out.println(SampleTest.this.x);
  }
}

class SampleTest{
  int x = 1000;
  static int y = 1000;
}
