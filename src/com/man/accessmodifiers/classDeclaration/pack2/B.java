package com.man.accessmodifiers.classDeclaration.pack2;

import com.man.accessmodifiers.classDeclaration.pack1.A;

public class B extends A {

  public static void main(String[] args) {
    B b = new B();
    b.sampleProtectedMethod();
    b.samplePublicMethod();
    A a = new A();
    a.samplePublicMethod();
    A ab = new B();
    ab.samplePublicMethod();
  }
}
