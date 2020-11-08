package com.man.files;

import java.io.*;
import java.util.StringJoiner;

public class CustomisedSerialisation {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    saveValuesFromObject();
    readValuesFromFile();
  }

  public static void saveValuesFromObject() throws IOException {
    FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    SpecialData data = new SpecialData();
    System.out.println("Data to be stored in file");
    System.out.println(data);
    objectOutputStream.writeObject(data);
    fileOutputStream.close();
  }

  public static void readValuesFromFile() throws IOException, ClassNotFoundException {
    FileInputStream fileInputStream = new FileInputStream("sample.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    SpecialData data = (SpecialData) objectInputStream.readObject();
    System.out.println("Data read from file");
    System.out.println(data);
    fileInputStream.close();
  }
}


class SpecialData implements Serializable {
  int key = 1;
  String value = "Sample Value";
  String desc = "Sample Desc";
  transient String password = "password";
  transient String locks = "locks";

  private void writeObject(ObjectOutputStream objectOutputStream) throws Exception {
    objectOutputStream.defaultWriteObject();
    objectOutputStream.writeInt(key);
    objectOutputStream.writeObject('a' + locks + 'a');
  }

  private void readObject(ObjectInputStream objectInputStream) throws Exception {
    objectInputStream.defaultReadObject();
    key = objectInputStream.readInt();
    locks = (String) objectInputStream.readObject();
    locks = locks.substring(1,locks.length()-1);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Data.class.getSimpleName() + "[", "]").add("key=" + key).add("value='" + value + "'")
        .add("desc='" + desc + "'").add("password='" + password + "'").add("locks='" + locks + "'").toString();
  }
}
