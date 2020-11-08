package com.man;

public class Sample {
  public static void main(String[] args) {
    System.out.println(args.length);
    int String = 10;
    String name = "manjunath";
    name.endsWith("th");
    name.startsWith("man");
    int base10 = 11;
    //int ocataBase8 = 0786; compilation exception as 8 is not octal value
    int ocataBase8 = 076; //number prefix with 0 specifies the value is in octal value
    int ocataBase16 = 0XFace; //0x/X specifies the value is in hexadecimal value
    System.out.println(String);
    System.out.println("ocataBase8 : "+ocataBase8);
    System.out.println("ocataBase16 : "+ocataBase16);
    System.out.println("Sum : "+ocataBase8+ocataBase16+String);

    //int xl = 10l; can't specify long value to int
    long x = 10l; //l specifies explcitly the value is of type long

    //float floatingValue = 12.0; //by default floating literals were considered as double value
    double dValue = 12.0;
    float fValue = 12.0f;
    //char charValue = 'ab';

    System.out.println("hi this is\n new line example");
    System.out.println("hi this is\t horizontal tab");
    System.out.println("hi this is\r Carriage return");
    System.out.println("hi this is\b back space");
    System.out.println("hi this is\f form feed");

    double number = 12_12_123.1_2_3;
    double number2 = 12_12_123.123;
    int []xa = new int[3];
    int[][] xam = new int[3][4];
    int []xa0 = new int[0];
    //int []x_minus3 = new int[-3];
    //System.out.println("x_minus3 "+x_minus3.length);
    int[] []a,b[];
    //double number3 = 12_12_123_._1_2_3_; can't use _ prefix or suffix
    System.out.println("number "+number);
    System.out.println("number2 "+number2);
    System.out.println("xa class name "+xa.getClass().getName());



    String string = "msn";
    string.length();
    int axl = xa.length;
    System.out.println("matrix size considered only root array : " + xam.length);


    int notInitialisation;
    //System.out.println(notInitialisation);
    boolean instance = null instanceof String;
    System.out.println(instance);

    System.out.println("Bit operators");
    System.out.println(4&5);
    System.out.println(4|5);
    System.out.println(4^5);
    System.out.println(~4);
    //System.out.println(~true);


    if(true & false){
      //execute both here
    }

    if(true && false){
      //return false if first one itself false
    }
    String[] messageParams = new String[2];messageParams[2]="dsf";
    System.out.println(messageParams.length);
  }
}
