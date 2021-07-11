package com.man.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample1 {
  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(4, 9 , 6 , 10, 3, 7);

//    Ans = [9, 10, 10, -1, 7, -1]

    integers.forEach(System.out::println);
  }

  public static List<Integer> findNextGrtNum(List<Integer> integers){

    List<Integer> output = new ArrayList<>();//-1,7
    List<Integer> stack = new ArrayList<>();//
    for (int i=integers.size();i>0;i--){
      while(stack.size()!=0){
        if(stack.get(stack.size())>integers.get(i)){
          output.add(stack.get(stack.size()));
          stack.add(integers.get(i));
          break;
        }else{
          stack.remove(stack.size());
        }
      }
      if(stack.size()==0){
        output.add(-1);
        stack.add(integers.get(i));
      }
    }
    return output;
  }
}
