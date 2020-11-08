package com.man.utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SamplePrintWriter {

  public static void main(String[] args) throws FileNotFoundException {
    PrintWriter writer = new PrintWriter("sample.txt");
    writer.println("First line");
    writer.close();
  }
}
