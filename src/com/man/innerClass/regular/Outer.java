package com.man.innerClass.regular;

  class Outer {

  int x = 10;
  static int y = 20;
   public class Inner{
    protected void m1(){
      System.out.println("M1 method of inner class");
    }

    private void m2(){
      System.out.println("M12 method of inner class");
      System.out.println(x);
      System.out.println(y);
    }
  }

  private void m2(){
    System.out.println("M2 method of outer class");
    Inner inner = new Inner();
    inner.m1();
  }

  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner =  outer.new Inner();
    System.out.println("Called M1 method of inner class");
    inner.m1();

    System.out.println("Called M2 method of inner class in another way");
    new Outer().new Inner().m2();

    System.out.println("Called M2 method of outer class");
    outer.m2();

    System.out.println("Called M1 method of outer class");
    outer.m1();
  }

  private void m1(){
    System.out.println("M1 method of outer class");
    System.out.println(x);
    System.out.println(y);
  }
}
