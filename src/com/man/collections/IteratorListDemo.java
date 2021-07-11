package com.man.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorListDemo {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    for(int i=0;i<=10;i++){
      if(i!=3) {
        integers.add(i);
      }
    }
    System.out.println("size :" + integers.size());
    ListIterator iterator = integers.listIterator();
    while (iterator.hasNext()){
      int ele = (Integer)iterator.next();
      System.out.print(" "+ele);
      if(ele==0) {
        iterator.remove();
      }
      if(ele==2){
        iterator.add(3);
        System.out.println("Added!");
      }
      if(ele==3){
        System.out.println("Found!");
      }
      if(ele==5){
        iterator.set(15);
      }
      if(ele==6){
        iterator.previous();
        iterator.set(16);
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
