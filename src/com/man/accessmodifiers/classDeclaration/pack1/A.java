package com.man.accessmodifiers.classDeclaration.pack1;

public class A {

  protected void sampleProtectedMethod(){
    System.out.println("hello i'am sampleProtectedMethod");
  }

  public void samplePublicMethod(){
    System.out.println("hello i'am samplePublicMethod");
  }

  private void samplePrivateMethod(){
    System.out.println("hello i'am samplePrivateMethod");
  }

  void sampleDefaultMethod(){
    System.out.println("hello i'am sampleDefaultMethod");
  }
}

class J{

  public static void main(String[] args) {
    A a = new A();
    a.samplePublicMethod();
    a.sampleDefaultMethod();
    a.sampleProtectedMethod();
  }
}
