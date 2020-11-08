package com.man.overriding;

public class TestOverride {

  public static void main(String[] args) {

    System.out.println("Initiated via Parents");
    System.out.println("---------------------");
    Parent p = new Parent();
    p.respect();
    p.property();
    p.marry();

    System.out.println("-------------------------------------------");
    System.out.println("\nInitiated via Parents along with child");
    System.out.println("---------------------");
    Parent pc = new Child();
    pc.respect();
    pc.property();
    pc.marry();

    System.out.println("-------------------------------------------");
    System.out.println("\nInitiated via Child");
    System.out.println("---------------------");
    Child c = new Child();
    c.respect();
    c.property();
    c.marry();
    System.out.println("-------------------------------------------");
  }
}
