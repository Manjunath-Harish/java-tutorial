package com.man.files;

import java.io.*;

public class InheritenceOnSerialization {

  public static void main(String args[])
  {
    System.out.println("Before Creating Object");
    SerializationMain s1=new SerializationMain(10,"Anurag");
    try
    {
      System.out.println("Serializing Object");
      FileOutputStream fis=new FileOutputStream("Test.ser");
      ObjectOutputStream ois=new ObjectOutputStream(fis);
      ois.writeObject(s1);
    } catch(Exception e1) {
      e1.printStackTrace();
    }
    try
    {
      FileInputStream fis=new FileInputStream("Test.ser");
      ObjectInputStream ois=new ObjectInputStream(fis);
      Object o1=ois.readObject();
      SerializationMain s2=(SerializationMain)o1;
    }
    catch(Exception e1)
    {
      e1.printStackTrace();
    }
  }
}
class Parent123
{
  int age;
  String name;

  public Parent123(){
    System.out.println("Parent123 constructor");
  }
  Parent123(int age,String name) {
    System.out.println("We are in Parent123 Constructor");
    this.age=age;
    this.name=name;
  }
}

class SerializationMain extends Parent123 implements Serializable {
  int data1;
  String data2;

  SerializationMain(int data1,String data2)
  {
    super(20,"test");
    this.data1=data1;
    this.data2=data2;
  }

  public void setData1(int data1)
  {
    this.data1=data1;
  }
  public void setData2(String data2)
  {
    this.data2=data2;
  }
  public String getData2()
  {
    return data2;
  }
  public int getData1()
  {
    return data1;
  }
}
