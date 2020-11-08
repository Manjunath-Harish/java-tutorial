package com.man.overriding;

public class Child extends Parent {

  /**
   * METHOD HIDING
   */
  public static void respect(){
    System.out.println("Respect to the Child");
  }

  @Override
  public void property(){
    System.out.println("Child Property");
  }

  @Override
  public void marry(){
    System.out.println("Child proposal for marry");
  }

}
