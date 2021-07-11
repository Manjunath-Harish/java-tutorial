package com.man.test;

import java.util.Arrays;
import java.util.List;

public class Sample {

  public static void main(String[] args) {

    List<Integer> integers = Arrays.asList(10 ,10,10,10,10);
    int findingElement = 10;

    System.out.println(findOccurance(integers,findingElement));

  }

  public static int findOccurance(List<Integer> input,int element){
    int firstIndex = input.indexOf(element);
    int size = input.size()-firstIndex;
    int count = 0;
    while(size!=0){
      if(input.get(size) > element){
        size = size+count/2;
      }else{
        if(input.size() <= size+1 && input.get(size+1) == element) {
          count = size;
          size = size + (size / 2);
        }else {
          return size;
        }
      }
    }
    return size;
  }
}
