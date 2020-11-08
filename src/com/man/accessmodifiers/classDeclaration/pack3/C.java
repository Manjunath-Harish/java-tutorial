package com.man.accessmodifiers.classDeclaration.pack3;

import com.man.accessmodifiers.classDeclaration.pack2.B;

public class C extends B {
  public static void main(String[] args) {
    C c = new C();
    c.sampleProtectedMethod();
    c.samplePublicMethod();
    B b = new B();
    b.samplePublicMethod();

    B cb = new C();
    cb.samplePublicMethod();

  }
}
