package com.man.problems;

public class Casting {

  public static void main(String[] args) {
    Child child = new Child();
    System.out.println(child instanceof Parent);
  }
}

class Parent{

}

class Child extends Parent{

}
