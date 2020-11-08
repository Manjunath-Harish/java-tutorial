package com.man.accessmodifiers.classDeclaration;

import com.sun.deploy.util.StringUtils;

import java.util.*;

import static java.util.Base64.*;

public class ImportStatements {

  public static void main(String[] args) {
    System.out.println("Square root of number no need to import math as itlang package classes for available by default " + Math.sqrt(4));

    System.out.println("explicit import" + StringUtils.trimWhitespace("Manjunath with speace suffix "));
    System.out.println("implicit import" + Arrays.asList("hi", "hello"));

    System.out.println("static import" + getUrlEncoder());

  }
}
