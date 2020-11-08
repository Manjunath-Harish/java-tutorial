package com.man.exceptions;

/**
 * Sample code for ExceptionInInitializerError
 */
public class InitialiserError {

  static {
    String s = null;
    s.length();
  }

  static int a = 1/0;

  public static void main(String[] args) {
    System.out.println(a);
  }
}
