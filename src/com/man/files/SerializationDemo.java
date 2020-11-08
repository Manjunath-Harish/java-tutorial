package com.man.files;

import java.io.*;
import java.util.StringJoiner;

public class SerializationDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    saveValuesFromObject();
    readValuesFromFile();
  }

  public static void saveValuesFromObject() throws IOException {
    FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    Data data = new Data();
    System.out.println("Data to be stored in file");
    System.out.println(data);
    objectOutputStream.writeObject(data);
    fileOutputStream.close();
  }

  public static void readValuesFromFile() throws IOException, ClassNotFoundException {
    FileInputStream fileInputStream = new FileInputStream("sample.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Data data = (Data)objectInputStream.readObject();
    System.out.println("Data read from file");
    System.out.println(data);
    fileInputStream.close();
  }
}


class Data implements Serializable{
  int key = 1;
  String value = "Sample Value";
  String desc = "Sample Desc";
  transient String password = "password";
  transient String locks = "locks";

  @Override
  public String toString() {
    return new StringJoiner(", ", Data.class.getSimpleName() + "[", "]").add("key=" + key).add("value='" + value + "'")
        .add("desc='" + desc + "'").add("password='" + password + "'").add("locks='" + locks + "'").toString();
  }
}
