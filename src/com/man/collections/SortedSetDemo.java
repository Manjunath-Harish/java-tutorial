package com.man.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
  public static void main(String[] args) {
    SortedSet hashSet = new TreeSet();
    hashSet.add(4);
    hashSet.add(6);
    hashSet.add(1);
    Iterator iterator = hashSet.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
