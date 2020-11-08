package com.man.accessmodifiers.classDeclaration;

public class ProtectedSample {
  protected void printHello(){
    System.out.println("Inside protected method");
  }
}


class Sample {
  public static void main(String[] args) {
    ProtectedSample protectedSample = new ProtectedSample();
    protectedSample.printHello();
  }
}
