package com.man.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {
  public static void main(String[] args) throws IOException {
    File file = new File("asdfghjkjhgfds.txt");
    System.out.println(file.exists());
    file.createNewFile();
    System.out.println(file.exists());
    System.out.println(file.isFile());
    System.out.println(file.isDirectory());
    System.out.println(file.list());
    System.out.println(file.delete());
  }

  public static void writeDataOnFile(String fName) throws IOException {
    FileWriter writer = new FileWriter(fName);
    writer.append('a');
  }
}
