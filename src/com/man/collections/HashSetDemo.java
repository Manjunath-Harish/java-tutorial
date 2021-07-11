package com.man.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("ABC");
    hashSet.add("BCA");
    hashSet.add("CAB");
    for (String ele : hashSet) {
      System.out.print(" " + ele);
    }
  }
}
