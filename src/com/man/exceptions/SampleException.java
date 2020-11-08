package com.man.exceptions;

public class SampleException {

  public static void main(String[] args) {
    divByZeroWithTryCatchAndSTackTrace();
    //divByZero();
  }

  private static void divByZero() {
    int a = 1 / 0;
    System.out.println(1 / 0);
  }

  private static void divByZeroWithTryCatchAndSTackTrace() {
    int a = 0;
    String b = null;
    try {
     b.equalsIgnoreCase("manjunath");
      a = 1 / 0;
    } catch (NullPointerException | ArithmeticException e) {
      System.out.println("e : " + e);
      System.out.println("printStackTrace");
      e.printStackTrace();
      System.out.println("e.getStackTrace() : " + e.getStackTrace());
      System.out.println("e.getMessage() : " + e.getMessage());
      System.out.println("e.getCause() : " + e.getCause());
      System.out.println("e.getLocalizedMessage() : " + e.getLocalizedMessage());
      System.out.println("e.getSuppressed() : " + e.getSuppressed());
    }
    System.out.println("output : " + a);
  }

}
