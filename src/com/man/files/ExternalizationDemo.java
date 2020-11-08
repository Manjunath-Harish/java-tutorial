package com.man.files;

import java.io.*;
import java.util.StringJoiner;

public class ExternalizationDemo {

  public ExternalizationDemo(){
    System.out.println("Main thread constructor");
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    saveValuesFromObject();
    readValuesFromFile();
  }

  public static void saveValuesFromObject() throws IOException {
    FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    ExternalizationData data = new ExternalizationData();
    System.out.println("Data to be stored in file");
    System.out.println(data);
    objectOutputStream.writeObject(data);
    fileOutputStream.close();
  }

  public static void readValuesFromFile() throws IOException, ClassNotFoundException {
    FileInputStream fileInputStream = new FileInputStream("sample.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    ExternalizationData data = (ExternalizationData) objectInputStream.readObject();
    System.out.println("Data read from file");
    System.out.println(data);
    fileInputStream.close();
  }
}

class ExternalizationData implements Externalizable {

  public ExternalizationData(){
    System.out.println("ExternalizationData thread constructor");
  }
  int key = 1;
  transient String value = "Sample Value";//Meaning less it will be nutral as transient is not used in externalisation
  String desc = "Sample Desc";
  transient String password = "password";
  transient String locks = "locks";

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(key);
    out.writeObject(value);
    out.writeObject(desc);
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    key = (int) in.readObject();
    value = in.readObject().toString();
    desc = in.readObject().toString();
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Data.class.getSimpleName() + "[", "]").add("key=" + 1).add("value='" + value + "'")
        .add("desc='" + desc + "'").add("password='" + password + "'").add("locks='" + locks + "'").toString();
  }
}
