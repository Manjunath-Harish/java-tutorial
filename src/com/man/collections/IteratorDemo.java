package com.man.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    for(int i=0;i<=10;i++){
      integers.add(i);
    }
    System.out.println("size :" + integers.size());
    Iterator iterator = integers.iterator();
    while (iterator.hasNext()){
      int ele = (Integer)iterator.next();
      System.out.print(" "+ele);
      if(ele==0) {
        iterator.remove();
      }
    }
    System.out.println();
    for (int e : integers) {
      System.out.print(" "+e);
    }
    System.out.println();
    System.out.println("size :" + integers.size());
  }
}
