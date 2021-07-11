package com.man.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class moneyView {
  public static void main(String[] args) {

    List<Integer> integers = Arrays.asList(2, 5, 1, 8, 7, 3, 10);
    List<Integer> list = solution(integers);
    for(int i=list.size()-1;i>=0;i--){
      System.out.println(list.get(i));
    }
  }

  public static List<Integer> solution(List<Integer>  integers){
    Stack<Integer> stack = new Stack<>();
    List<Integer> output = new ArrayList<>();
    for (int i=integers.size()-1;i>=0;i--){
      while(!stack.empty()){
        int a = stack.pop();
        if (a > integers.get(i)) {
          output.add(a);
          stack.push(a);
          stack.push(integers.get(i));
          break;
        }
      }
      if(stack.empty()){
        stack.push(integers.get(i));
        output.add(-1);
      }

    }
    return output;

  }
}
