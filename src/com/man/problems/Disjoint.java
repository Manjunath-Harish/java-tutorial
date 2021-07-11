package com.man.problems;

import java.util.HashSet;
import java.util.Set;

public class Disjoint {

  public static void main(String[] args) {
    int[] a = {1,12,42,70,36,-4,43,15};
    int[] b = {5,15,44,72,36,2,69,24};
    int count=0;
    int size = a.length;
    Set<Integer> integers = new HashSet<>();
    for (int i=0;i<size;i++){
      int maxX = a[i];
      int minY= b[i];
      if(a[i]>b[i]){
        maxX=a[i];
        minY=b[i];
      }
      integers.add(i);
      for(int j=0;j<size;j++){
        if(!integers.contains(j)) {
          if(maxX>=a[j] && minY<=a[j]){
            integers.add(j);
          }
          if(maxX>=b[j] && minY<=b[j]){
            integers.add(j);
          }
        }
      }
    }
    System.out.println(count);
  }
}
